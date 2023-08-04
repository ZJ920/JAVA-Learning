package day19.thread;

public class test4 {
    public static void main(String[] args){
        TreadDemo t1 = new TreadDemo("线程一");
        TreadDemo t2 = new TreadDemo("线程二");

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
