package day16.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\我的图片\\Wallhaven\\高达.jpg");
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day16\\io\\高达.jpg");

        int index;
        while ((index = fis.read()) != -1){
            fos.write(index);
        }

        fos.close();
        fis.close();
    }
}
