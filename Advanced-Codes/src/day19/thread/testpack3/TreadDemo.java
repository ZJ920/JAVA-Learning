package day19.thread.testpack3;

public class TreadDemo extends Thread{

    static int number = 100;
    static final Object lock = new Object();
    @Override
    public void run(){
        while (true){
            synchronized (lock){
                if (number > 100){
                    break;
                }else {
                    number--;
                    System.out.println(Thread.currentThread().getName()+"正在送第"+(100-number)+"个礼物"+"剩余："+number);
                    try {
                        Thread.sleep(200);
                        Thread.yield();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
