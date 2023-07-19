//扫描所有磁盘的文件
package day15.file;

import java.io.File;

public class test4 {
    public static void main(String[] args){
        //findAVI();//所有磁盘
        findAVI(new File("D:\\"));
    }
    public static void findAVI(){
        File[] arr = File.listRoots();
        for (File file : arr){
            findAVI(file);
        }
    }
    public static void findAVI(File file){
        File[] arrFile = file.listFiles();
            for (File arrFiles : arrFile){
                if (arrFiles.isFile()){//文件
                    if (arrFiles.getName().endsWith(".mp4")){
                        System.out.println(arrFiles);
                    }
                }else {//文件夹
                    findAVI(arrFiles);
                }
            }
        }
}
