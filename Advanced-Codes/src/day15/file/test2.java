package day15.file;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Advanced-Codes\\src\\day15\\file\\aaa");
//        File[] arr = f1.listFiles();
//        for (File file : arr){
//            System.out.println(file);
//        }
        System.out.println("创建文件夹："+f1.mkdirs());
        File src = new File(f1,"a.txt");
        System.out.println("创建文件："+src.createNewFile());
    }
}
