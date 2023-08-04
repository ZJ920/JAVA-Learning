package day19.thread;

public class test6 {
    public static void main(String[] args) throws InterruptedException {
        MyTreadDemo6 myTreadDemo6 = new MyTreadDemo6();

        Thread thread1 = new Thread(myTreadDemo6);
        Thread thread2 = new Thread(myTreadDemo6);
        Thread thread3 = new Thread(myTreadDemo6);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("-------------------------");
        System.out.println("窗口1：" + MyTreadDemo6.a);
        System.out.println("窗口2：" + MyTreadDemo6.b);
        System.out.println("窗口3：" + MyTreadDemo6.c);
        System.out.println("-------------------------");
    }
}
