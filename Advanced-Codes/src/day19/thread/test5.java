package day19.thread;

public class test5 {
    public static void main(String[] args){
        MyTread1 myTread1 = new MyTread1();
        MyTread1 myTread2 = new MyTread1();
        MyTread1 myTread3 = new MyTread1();

        myTread1.setName("窗口一");
        myTread2.setName("窗口二");
        myTread3.setName("窗口三");

        myTread1.start();
        myTread2.start();
        myTread3.start();
    }
}
