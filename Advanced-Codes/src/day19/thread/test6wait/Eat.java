package day19.thread.test6wait;

public class Eat extends Thread{
    /*
     * 1. 循环
     * 2. 同步代码块
     * 3. 判断共享数据是否到了末尾（到了末尾）
     * 4. 判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
     * */
    public void run() {
        while (true){
            synchronized (Desk.lock){
                //判断是否还能吃
               if (Desk.count == 0){
                   break;
               }else {
                   //判断是否还有食物
                   if (Desk.food == 0){
                       try {
                           System.out.println("消费者等待...");
                           Desk.lock.wait();//让当前线程跟锁进行绑定并释放锁
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }else {

                       System.out.println(Thread.currentThread().getName()+"在吃第："+(11-Desk.count)+"碗面");
                       System.out.println("----------------------------");
                       //修改能吃食物的份数
                       Desk.count--;
                       //修改桌子状态
                       Desk.food = 0;
                       //唤醒与lock锁绑定的所有线程（厨师）
                       Desk.lock.notify();
                   }
               }
            }
        }
    }
}
