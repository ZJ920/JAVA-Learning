package day19.thread.test6wait;

import java.util.concurrent.ArrayBlockingQueue;

public class Eat2 extends Thread{

    public Eat2(){

    }
    ArrayBlockingQueue<String> arrayBlockingQueue;
    Object lock;
    String food;
    public Eat2(ArrayBlockingQueue<String> arrayBlockingQueue, Object lock){
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.lock = lock;
    }

    @Override
    public void run(){
        while (true){
            try {
                food = arrayBlockingQueue.take();
                System.out.println("吃面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
