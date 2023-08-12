package day20.inetaddress.thread;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyThread implements Runnable {
    Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;//从链接通道中获取数据
        OutputStream os = null;
        try {
            String name = UUID.randomUUID().toString().replace("-", "");
            is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            FileOutputStream fis = new FileOutputStream("Advanced-Codes\\src\\day20\\inetaddress\\thread\\" + name + ".jpg");
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
                 * 个人猜测：缓存流底层是一个8192？的数组缓存，没满就需要手动刷新
                 * */
                //bos.flush();
            }
            bos.close();

            //回写数据
            os = socket.getOutputStream();
            os.write("已接收".getBytes());

            os.close();
            is.close();
            //ss.close();//关闭服务器
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
