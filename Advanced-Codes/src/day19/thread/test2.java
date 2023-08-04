package day19.thread;

public class test2 {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();

        Thread t1 = new Thread(myRun);
        t1.setName("线程一");
        t1.start();


        for (int i = 0; i < 200; i++) {
            System.out.println("main线程1-" + i);
        }

        Thread t2 = new Thread(myRun);
        t2.setName("线程二");
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main线程2-" + i);
        }
    }

}
