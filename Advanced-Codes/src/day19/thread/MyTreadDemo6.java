package day19.thread;

public class MyTreadDemo6 implements Runnable {
    int ticket = 0;
    static int a = 0, b = 0, c = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) {
                break;
            }
        }
    }

    private synchronized boolean method() {
        if (ticket < 100) {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
            if ("窗口1".equals(Thread.currentThread().getName())) {
                a++;
            }
            if ("窗口2".equals(Thread.currentThread().getName())) {
                b++;
            }
            if ("窗口3".equals(Thread.currentThread().getName())) {
                c++;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return false;
        } else {
            return true;
        }
    }

}
