package day20.inetaddress.thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo1 {
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

        while(true) {
            Socket socket = ss.accept();//建立通道

            pool.submit(new MyThread(socket));

            //new Thread(new MyThread(socket)).start();
        }
    }
}
