package day15.file;

import java.io.File;

//删除
public class test5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day15\\file\\aaa\\ddd");
        System.out.println(deleteFile(f1));
//        File[] files = f1.listFiles();
//        System.out.println(files.length);
//        for (File file: files){
//            System.out.println(file);
//        }
    }

    public static boolean deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null){//如果是文件则为空，文件夹则不为空可能长度为0
            if (files.length > 0) {//文件夹不为空
                for (File file1 : files) {
                    deleteFile(file1);
                }
            }
            return file.delete();
        }
        return file.delete();
        }

}
