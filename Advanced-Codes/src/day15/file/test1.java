package day15.file;

import java.io.File;

public class test1 {
    public static void main(String[] args){
        File f1 = new File("JAVA\\Advanced-Codes\\src\\day15\\file\\aaa\\aaa.txt");
        System.out.println(f1.getAbsolutePath());//绝对路径
        System.out.println(f1.getPath());//返回定义文件时使用的路径
        System.out.println(f1.getName());

        File f2 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day15\\file\\aaa");
        File[] arr = f2.listFiles();
        for(File file : arr){
            if (file.isFile() && "bbb.txt".equals(file.getName())){
                System.out.println(file);
            }
        }
    }
}
