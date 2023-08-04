package day19.thread.test6wait;

public class Cook extends Thread {
    /*
     * 1. 循环
     * 2. 同步代码块
     * 3. 判断共享数据是否到了末尾（到了末尾）
     * 4. 判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
     * */
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.food != 0) {
                        //有食物：等待
                        try {
                            Desk.lock.wait();
                            System.out.println("厨师等待...");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("制作第：" + (11 - Desk.count + "碗食物"));
                        //修改桌面食物状态
                        Desk.food = Desk.food + 1;
                        //唤醒消费者
                        Desk.lock.notifyAll();
                    }
                }
            }
        }

    }
}
