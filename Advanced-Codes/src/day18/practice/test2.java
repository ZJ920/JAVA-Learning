package day18.practice;

import java.io.*;
import java.util.*;

public class test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day18\\practice\\allnames.txt"));
        //全部读出到hashMap集合
        HashMap<Integer, String> hashMap = getIntegerStringHashMap(br);
        //        Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();
//        for (Map.Entry<Integer,String> entry : entries){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        //
        //随机点名
        //随机点名
        selectName(hashMap);

    }

    private static void selectName(HashMap<Integer, String> hashMap) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int size = hashMap.size();//随机范围
        while (!hashMap.isEmpty()){
            int index = random.nextInt(size);//产生随机数
            if (hashMap.containsKey(index)){
                System.out.println("点中："+index+"-"+ hashMap.get(index));
                hashMap.remove(index);
                System.out.println("是否继续（Y/N）：");
                String str = sc.nextLine();
                if (!("Y".equals(str))){
                    break;
                }
            }
        }
    }

    private static HashMap<Integer, String> getIntegerStringHashMap(BufferedReader br) throws IOException {

        int i = 0;//键
        String len;//值
        HashMap<Integer,String> hashMap = new HashMap<>();

        while ((len = br.readLine()) != null){
            len = len.split("-")[0];//裁剪：钦逸抒-女-21 [钦逸抒]
            hashMap.put(i,len);// 0->钦逸抒
            i++;
        }
        br.close();
        return hashMap;
    }
}
