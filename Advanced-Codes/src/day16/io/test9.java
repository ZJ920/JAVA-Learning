package day16.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Advanced-Codes\\src\\day16\\io\\加密高达.jpg");
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day16\\io\\高达.jpg");

        byte[] bytes = new byte[1024];
        int len;

        while ((len = fis.read(bytes)) != -1) {
            for (int i = 0; i < len; i++) {
                bytes[i] = (byte) (bytes[i] ^ 1622);
            }
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }
}
