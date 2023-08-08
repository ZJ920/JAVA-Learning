package day19.thread.testpack3;

import day19.thread.testpack2.TreadDemo;

/*
两线程同时获取1-100的数，输出奇数
 */
public class test {
    public static void main(String[] args) {
        TreadDemo treadDemo = new TreadDemo();

        Thread thread1 = new Thread(treadDemo);
        Thread thread2 = new Thread(treadDemo);

        thread1.setName("奇数1");
        thread2.setName("奇数2");

        thread1.start();
        thread2.start();
    }
}

