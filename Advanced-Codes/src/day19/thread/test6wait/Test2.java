package day19.thread.test6wait;

import java.util.concurrent.ArrayBlockingQueue;

public class Test2 {
    public static void main(String[] args){
        Object lock = new Object();
        String name="aaa";
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

        Eat2 eat2 = new Eat2(arrayBlockingQueue,lock);
        Cook2 cook2 = new Cook2(arrayBlockingQueue,lock);

        eat2.setName("顾客");
        cook2.setName("厨师");
    }

}
