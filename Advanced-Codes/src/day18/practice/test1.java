package day18.practice;

import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test1 {
    public static void main(String[] args) throws IOException {
                /*
         制造假数据：
             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */
        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //获取爬取到的网页信息
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //使用正则表达式切割有用信息
        ArrayList<String> familyNameTemp = getData(familyNameStr,"(.{4})(，|。)",1);
        ArrayList<String> boyNameTemp = getData(boyNameStr,"([\\u4E00-\\u9FA5]{2})(，|。)",1);
        ArrayList<String> girlNameTemp = getData(girlNameStr,"(.. ){4}",0);

        ArrayList<String> familyNameTemp1 = getName(familyNameTemp,1);
        ArrayList<String> boyNameTemp1 = getName(boyNameTemp,2);
        ArrayList<String> girlNameTemp1 = getName(girlNameTemp,3);

        //写出数据
        //男生随机组合
        ArrayList<String> boyName = makeName(familyNameTemp1,boyNameTemp1);
        ArrayList<String> girlName = makeName(familyNameTemp1,girlNameTemp1);

        //IO流写出数据
        FileOutputStream fos = new FileOutputStream("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day18\\practice\\name.txt",true);
        outInputStream(boyName,"boy",fos);
        outInputStream(girlName,"girl",fos);
        fos.close();
        
    }

    private static void outInputStream(ArrayList<String> Name,String gender,FileOutputStream fos) throws IOException {
        if ("boy".equals(gender)){
            IOUtils.write("\r\n男生：\r\n",fos);
        }
        if ("girl".equals(gender)){
            IOUtils.write("\r\n女生：\r\n",fos);
        }
        for (String str : Name){
            IOUtils.write(str+" ",fos);
        }
    }

    private static ArrayList<String> makeName(ArrayList<String> familyNameTemp1, ArrayList<String> nameTemp1) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String value : familyNameTemp1) {
            for (String s : nameTemp1) {
                arrayList.add(value + s);
            }
        }
        return arrayList;
    }

    private static <T> ArrayList<T> getName(ArrayList<T> t,int i) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (i == 1){
            for (T t1  : t){
                char[] character = t1.toString().toCharArray();
                for (char c : character) {
                    arrayList.add((T) (c + ""));
                }
            }
        }
        if (i == 2){
            for (T t1  : t){
                if (!arrayList.contains(t1)){
                    arrayList.add(t1);
                }
            }
        }
        if (i == 3){
            for (T t1  : t){
                String[] str = t1.toString().split(" ");
                for (String s : str) {
                    arrayList.add((T) s);
                }
            }
        }
        return arrayList;
    }

    /*
     * 作用：根据正则表达式获取字符串中的数据
     * 参数一：
     *       完整的字符串
     * 参数二：
     *       正则表达式
     * 参数三：
     *      获取数据
     *       0：获取符合正则表达式所有的内容
     *       1：获取正则表达式中第一组数据
     *       2：获取正则表达式中第二组数据
     *       ...以此类推
     *
     * 返回值：
     *       真正想要的数据
     *
     * */
    private static ArrayList<String> getData(String Str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> arrayList = new ArrayList<>();
        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则，到str当中获取数据
        Matcher matcher = pattern.matcher(Str);
        while (matcher.find()){
            arrayList.add(matcher.group(index));
            //System.out.println(matcher.group(index));
        }

        return arrayList;
    }
    /*
     * 作用：
     *   从网络中爬取数据，把数据拼接成字符串返回
     * 形参：
     *   网址
     * 返回值：
     *   爬取到的所有数据
     * */
    private static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.链接上这个网址
        //细节：保证网络是畅通的，而且这个网址是可以链接上的。
        URLConnection con = url.openConnection();

        //4.读取数据
        InputStreamReader isr = new InputStreamReader(con.getInputStream());
        int len;
        char[] chars = new char[1024*5];
        while ((len = isr.read(chars)) != -1){
            sb.append(chars,0,len);
        }
        //5.释放资源
        isr.close();

        //6.把读取到的数据返回
        return sb.toString();
    }
}
