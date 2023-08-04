package day19.thread.test6wait;

public class Desk {
    static Object lock = new Object();//锁
    static int food = 0;//是否有·食物
    static int count = 10;//能吃下的食物数
}
