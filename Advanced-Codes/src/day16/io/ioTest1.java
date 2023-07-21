package day16.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class ioTest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day16\\io\\a.txt",true);
        //fos.write(97);
        byte[] bytes = {97,98,99,100};
        fos.write(bytes);
        String str = "\r\n";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);
        byte[] bytes2 = {102,103,104};
        fos.write(bytes2);
        fos.close();
    }
}
