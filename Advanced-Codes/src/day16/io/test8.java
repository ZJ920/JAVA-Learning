/*
* 拷贝文件
* */package day16.io;

import java.io.*;

public class test8 {
    public static void main(String[] args) throws IOException {
        File aaa = new File("Advanced-Codes\\src\\day16\\io\\aaa");
        File bbb = new File("Advanced-Codes\\src\\day16\\io\\bbb");
        copyFile(aaa,bbb);
    }

    private static void copyFile(File aaa,File bbb) throws IOException {
        bbb.mkdirs();
        //1.aaa
        File[] aaaArr = aaa.listFiles();
        for (File arr : aaaArr){
            if (arr.isFile()){
                //读取
                FileInputStream fis = new FileInputStream(arr);
                //写入
                FileOutputStream fos = new FileOutputStream(new File(bbb,arr.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fis.close();
                fos.close();
            }else {
                //递归
                copyFile(arr,new File(bbb,arr.getName()));
            }
        }
    }
}
