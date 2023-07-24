//读取文本内容并处理(截取排序)
package day16.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class test10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Advanced-Codes\\src\\day16\\io\\b.txt");
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day16\\io\\b-1.txt");
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            //bytes是字符集 对应字符 的十进制整数数组
            //获取“-”的十进制字符集编码
            byte[] getByte1 = "-".getBytes();
            byte getByte = getByte1[0];
            //去掉“-”存入arrayList集合
            ArrayList<Byte> arrayList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (bytes[i] != getByte){
                    arrayList.add(bytes[i]);
                }
            }
            //将去掉“-”后的arrayList集合数据存入newByteTemp中间数组
            byte[] newByteTemp = new byte[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                newByteTemp[i] = arrayList.get(i);
            }
            //清空集合
            arrayList.clear();
            //排序
            Arrays.sort(newByteTemp);
            //拼接1 2 4 7 8 9和“-”存入arrayList集合
            for (int i = 0; i < newByteTemp.length; i++) {
                arrayList.add(newByteTemp[i]);
                if (i < newByteTemp.length-1){
                    arrayList.add(getByte);
                }
            }
            //将拼接好的arrayList集合数据存入最终的newByte数组
            byte[] newByte = new byte[len];
            for (int i = 0; i < arrayList.size(); i++) {
                newByte[i] = arrayList.get(i);
            }
            fos.write(newByte);
        }
        fos.close();
        fis.close();
    }
}
