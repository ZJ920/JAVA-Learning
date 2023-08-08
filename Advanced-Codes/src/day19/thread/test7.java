package day19.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test7 {
    public static void main(String[] args){
        ExecutorService pool = Executors.newCachedThreadPool();

        MyRun myRun = new MyRun();

        Thread thread1 = new Thread(myRun);
        Thread thread2 = new Thread(myRun);
        Thread thread3 = new Thread(myRun);
        Thread thread4 = new Thread(myRun);
        Thread thread5 = new Thread(myRun);

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");
        thread4.setName("线程4");
        thread5.setName("线程5");

        pool.submit(thread1);
        pool.submit(thread2);
        pool.submit(thread3);
        pool.submit(thread4);
        pool.submit(thread5);

    }
}
