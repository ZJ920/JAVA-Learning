package day15.file;

import java.io.File;

public class test6 {
    static int countTXT,countDOC,countJPG;
    public static void main(String[] args){

        File f1 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day15\\file\\test6_file");
        findFile(f1);
        System.out.println("txt文件："+countTXT);
        System.out.println("doc文件："+countDOC);
        System.out.println("jpg文件："+countJPG);
    }
    /*
    *
    * */
    public static void findFile(File file){
        File[] files = file.listFiles();
        if (files != null){
            for (File file1 : files){
                findFile(file1);
            }
        }
        if (file.getName().endsWith(".txt")){
            countTXT++;
        }
        if (file.getName().endsWith(".doc")){
            countDOC++;
        }
        if (file.getName().endsWith(".jpg")){
            countJPG++;
        }
    }
}
