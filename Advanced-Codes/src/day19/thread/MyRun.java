package day19.thread;

public class MyRun implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 100; i++) {
            System.out.println(t.getName()+"-"+i);
        }

    }
}
