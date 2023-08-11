package day20.inetaddress;

import java.io.*;
import java.net.Socket;

public class Test5 {
    //客户端
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 16227);

        //发送数据
        OutputStream os = socket.getOutputStream();
        //BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        //读取数据
        FileInputStream fis = new FileInputStream("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day20\\inetaddress\\testFile.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //??????
        //bos.flush();
        bis.close();


        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int a;
        while ((a = isr.read()) != -1) {
            System.out.print((char) a);
        }

        is.close();
        socket.close();
    }
}
