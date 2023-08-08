package day19.thread.testpack1;

public class TreadDemo extends Thread{

    static int number = 100;
    static final Object lock = new Object();
    @Override
    public void run(){
        while (true){
            synchronized (lock){
                if (number == 0){
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+(101-number)+"张票");
                    number--;
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
