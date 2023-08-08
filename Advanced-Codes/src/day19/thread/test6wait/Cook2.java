package day19.thread.test6wait;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook2 extends Thread{

    public Cook2(){

    }
    ArrayBlockingQueue<String> arrayBlockingQueue;
    Object lock;
    public Cook2(ArrayBlockingQueue<String> arrayBlockingQueue, Object lock){
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.lock = lock;
    }

    @Override
    public void run(){
        while (true){
            try {
                arrayBlockingQueue.put("面条");
                System.out.println("做了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
