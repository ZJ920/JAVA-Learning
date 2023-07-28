package day17.io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test10 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Advanced-Codes\\src\\day17\\io\\a.txt");
        File file2 = new File("Advanced-Codes\\src\\day17\\io");
        toZip(file1,file2);
    }

    private static void toZip(File file1, File file2) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(file2,"a.zip")));
        ZipEntry zipEntry = new ZipEntry(file1.getName());

        zos.putNextEntry(zipEntry);
        FileInputStream fis = new FileInputStream(file1);
        int b;
        while ((b = fis.read()) != -1){
            zos.write(b);
        }

        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
