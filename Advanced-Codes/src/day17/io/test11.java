package day17.io;
//压缩文件
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test11 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day17\\io\\aaa");
        File file2 = new File(file1.getParentFile(),file1.getName()+".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(file2));
        toZip(file1,zos,file1.getName());
        zos.close();
    }
/*
* 1.目标压缩文件路径
* 2.压缩流
* 3.压缩包内部文件路径:file1.getName()
* */
    private static void toZip(File file1,ZipOutputStream zos,String name) throws IOException {
        File[] files = file1.listFiles();
        ZipEntry zipEntry;
        for (File file : files){
            if (file.isFile()){
                //文件
                //压缩包内部文件路径打包成压缩包entry对象
                zipEntry = new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(zipEntry);

                FileInputStream fis = new FileInputStream(file);
                int len;
                byte[] bytes = new byte[1024*5];
                while ((len = fis.read(bytes)) != -1){
                    zos.write(bytes,0,len);
                }

                fis.close();
                zos.closeEntry();
            }else {
                //文件夹
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
