package day17.io;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Advanced-Codes\\src\\day17\\io\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Advanced-Codes\\src\\day17\\io\\b-1.txt"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
