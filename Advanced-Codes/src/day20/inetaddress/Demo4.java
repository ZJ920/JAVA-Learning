package day20.inetaddress;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo4 {
    //服务器端
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(16227);

        Socket socket = ss.accept();//建立通道

        InputStream is = socket.getInputStream();//从链接通道中获取数据

        InputStreamReader isr = new InputStreamReader(is);
        int a;
        while ((a = isr.read()) != -1){
            System.out.print((char)a);
        }

        //回写数据
        OutputStream os = socket.getOutputStream();
        os.write("已接收".getBytes());

        os.close();
        is.close();
        socket.close();
        ss.close();//关闭服务器
    }
}
