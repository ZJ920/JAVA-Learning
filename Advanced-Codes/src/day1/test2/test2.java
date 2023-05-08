package day1.test2;

public class test2 {
    public static void main(String[] args){
        Coder coder = new Coder("张三",23,15000);
        Manager manager = new Manager("李四",44,18000,5000);
        coder.work();
        manager.work();
    }
}
