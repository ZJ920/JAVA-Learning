package day19.thread.testpack2;

/*
两人同时送100份礼物，小于十份停止
 */
public class test {
    public static void main(String[] args) {
        TreadDemo treadDemo = new TreadDemo();

        Thread thread1 = new Thread(treadDemo);
        Thread thread2 = new Thread(treadDemo);

        thread1.setName("张三");
        thread2.setName("李四");

        thread1.start();
        thread2.start();
    }
}

