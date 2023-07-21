package day16.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\我的图片\\Wallhaven\\高达.jpg");
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day16\\io\\高达.jpg");

        int le;//每次拷贝的数组长度
        byte[] bytes = new byte[1024*1024*5];//5M

        while ((le = fis.read(bytes))  != -1){
            fos.write(bytes,0,le);
        }
        fos.close();
        fis.close();
    }
}
