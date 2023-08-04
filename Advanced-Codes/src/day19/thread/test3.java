package day19.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<>(myCallable);

        Thread thread = new Thread(ft);

        thread.start();

        int sum = ft.get();

        System.out.println(sum);
    }
}
