package day15.file;

import java.io.File;

public class test3 {
    public static void main(String[]args){
        File f1 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day15\\file\\aaa");
        System.out.println(haveAVI(f1));
    }

    public static boolean haveAVI(File file){
        File[] arr = file.listFiles();
        for (File file1 : arr){
            if (file1.isFile() && file1.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
