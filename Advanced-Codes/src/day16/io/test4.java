package day16.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "LOVE世界";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        System.out.println();
        String str1 = new String(bytes1);
        System.out.println(str1);

        String str2 = new String(bytes2,"GBK");
        System.out.println(str2);
    }
}
