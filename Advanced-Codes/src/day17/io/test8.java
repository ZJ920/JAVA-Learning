package day17.io;

import java.io.*;

public class test8 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
//        //字节打印流
//        PrintStream pr = new PrintStream(
//                new FileOutputStream("Advanced-Codes\\src\\day17\\io\\a.txt",true),
//                true,"UTF-8");
//
//        pr.write(97);
//        pr.println();
//        pr.println(true);
//        pr.println("你好世界");
//
//        pr.close();

        File file = new File("D:\\我的图片");
        File[] arrFile = file.listFiles();

        for (File file1 : arrFile){
            System.out.println(file1);
        }
    }
}
