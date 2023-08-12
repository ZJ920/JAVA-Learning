package day20.inetaddress.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    //服务器端
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(16227);

        //自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        try {
            while (true) {
                Socket socket = ss.accept();
                pool.submit(new MyThread(socket));
            }
        } finally {
            pool.shutdown(); // 关闭线程池
            ss.close(); // 关闭服务器端的ServerSocket
        }
    }
}
