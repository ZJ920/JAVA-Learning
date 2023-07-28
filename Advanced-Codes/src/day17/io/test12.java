package day17.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test12 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day17\\io\\a.txt");
        File file2 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day17\\io\\a-2.txt");
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        //System.out.println(FileUtils.readFileToString(file1));
        //FileUtils.copyDirectory(file1,file2);
        //IOUtils.copy(fis,fos);

    }
}
