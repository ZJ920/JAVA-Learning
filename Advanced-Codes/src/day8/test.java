package day8;

public class test {
    public static void main(String[] args) {
        int count=0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;

            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);

            if (sum == i) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("两位自幂数有"+count+"个");

        System.out.println("-------------------------------------");

        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i/100%10;
            int qian = i/1000%10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) +Math.pow(qian, 4);
            if (sum == i) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("三位自幂数有"+count+"个");

        System.out.println("-------------------------------------");

    }
}

interface Fu{
    public abstract void  print();
    public abstract void  print1();
    public abstract void  print2();
}
abstract class i implements Fu{

    //实例化抽象类没有意义；抽象类实现接口可以只重写接口中的某几个方法

        }
