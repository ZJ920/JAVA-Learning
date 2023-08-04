package day19.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTread1 extends Thread{

    static int ticket = 0;
//    static Object obj = new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run(){
        //死循环，只有线程被抢走后才能停止
        while (true){
            //synchronized (obj){
            lock.lock();
            try {
                if (ticket < 100){
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
                        Thread.sleep(100);
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            //  }
        }
    }
}
