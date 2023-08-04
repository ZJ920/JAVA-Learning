package day19.thread;

public class test1 {
    public static void main(String[] args){
        MyTread tread1 = new MyTread();
        MyTread tread2 = new MyTread();

        tread1.setName("进程一");
        tread2.setName("进程二");

        tread1.start();
        tread2.start();
    }
}
