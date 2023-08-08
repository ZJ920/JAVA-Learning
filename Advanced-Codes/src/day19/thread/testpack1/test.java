package day19.thread.testpack1;

/*
     一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
     要求:请用多线程模拟卖票过程并打印剩余电影票的数量
 */
public class test {
    public static void main(String[] args) {
        TreadDemo treadDemo = new TreadDemo();

        Thread thread1 = new Thread(treadDemo);
        Thread thread2 = new Thread(treadDemo);

        thread1.setName("窗口一");
        thread2.setName("窗口二");

        thread1.start();
        thread2.start();
    }
}

