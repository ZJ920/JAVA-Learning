package day20.inetaddress;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo5 {
    //服务器端
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(16227);

        Socket socket = ss.accept();//建立通道

        InputStream is = socket.getInputStream();//从链接通道中获取数据
        BufferedInputStream bis = new BufferedInputStream(is);
        FileOutputStream fis = new FileOutputStream("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\src\\day20\\inetaddress\\testFile-1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fis);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            /*
             * 使用flush()方法刷新的是输出流（BufferedOutputStream）的缓冲区。
             * 在调用flush()方法后，缓冲区中的数据会被立即发送到对应的目标（如套接字、文件等），
             * 而不会等待缓冲区填满或者关闭流时自动刷新。
             * 这可以确保数据能够及时发送，而不需要等待其他条件满足。
             * 在网络编程中，经常使用flush()方法来确保数据的及时发送。
             *
             * ???传输图片时不需要bos.flush()???
             * */
            //bos.flush();
        }
        bos.close();

        //回写数据
        OutputStream os = socket.getOutputStream();
        os.write("已接收".getBytes());

        os.close();
        is.close();
        socket.close();
        ss.close();//关闭服务器
    }
}
