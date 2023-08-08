package day18.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class test3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("1","111");
        prop.put("2","222");
        prop.put("3","333");
        prop.put("4","444");

        //写入配置
        FileOutputStream fos = new FileOutputStream("Advanced-Codes\\src\\day18\\practice\\a.properties");
        prop.store(fos,"test");
        fos.close();

        //加载配置
        FileInputStream fis = new FileInputStream("Advanced-Codes\\src\\day18\\practice\\a.properties");
        Properties properties = new Properties();
        properties.load(fis);
        fis.close();
        System.out.println(properties);
    }
}
