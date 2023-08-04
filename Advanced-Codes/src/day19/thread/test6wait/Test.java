package day19.thread.test6wait;

public class Test {
    public static void main(String[] args){
        Cook cook = new Cook();
        Eat eat = new Eat();
        cook.setName("厨师");
        eat.setName("消费者");
        eat.start();
        cook.start();

    }
}
