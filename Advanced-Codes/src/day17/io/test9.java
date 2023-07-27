package day17.io;
//解压文件
import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class test9 {
    public static void main(String[] args) throws IOException {
        //创建File对象表示要解压的压缩包
        File file1 = new File("Advanced-Codes\\src\\day17\\io\\aaa.zip");
        //创建File对象表示要解压的目的文件夹
        File file2 = new File("Advanced-Codes\\src\\day17\\io");
        zip(file1,file2);
    }

    public static void zip(File file1 ,File file2) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或文件夹读取出来，按层级拷贝到目的文件中
        //创建一个解压缩流来读取压缩包中的数据
        //如果不能解析，尝试指定编码集：如GBK
        ZipInputStream zi = new ZipInputStream(new FileInputStream(file1), Charset.forName("GBK"));
        ZipEntry entry;
        //先获取到压缩包里的每一个zipentry对象
        //表示当前在压缩包中获取到的文件夹或文件
        while ((entry = zi.getNextEntry()) != null){
            if (entry.isDirectory()){
                //文件夹：需要在目的文件夹创建一个相同的文件夹
                File file = new File(file2,entry.toString());
                file.mkdirs();
            }else {
                //文件：需要读取到压缩包中的文件，并存入目的文件夹file2中（按层级存放）
                FileOutputStream fos = new FileOutputStream(new File(file2,entry.toString()));

                int len;
                byte[] bytes = new byte[1024*5];
                while ((len = zi.read(bytes)) != -1){
                    //写到目的文件夹
                    fos.write(bytes,0,len);
                }
                fos.close();
            }
            //处理完毕，关闭entry
            zi.closeEntry();
        }
        //关闭流
        zi.close();
    }
}
