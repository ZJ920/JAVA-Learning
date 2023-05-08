package test2;

import java.util.Random;
import java.util.Scanner;

public class minterface {
    public static void main(String[] args){
        //匿名内部类new一个实现类对象
        useSum(new Sum(){

            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });

        System.out.println("----------------------------");

        useSum((a, b) -> a+b);//只有一个方法时使用Lambda表达式

    }
    public static void useSum(Sum sum){
        //Sum sum = new Sum(){
        //
        //            @Override
        //            public int sum(int a, int b) {
        //                return a+b;
        //            }
        //        }
        //左边接口类类型，右边实现类对象，多态。
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();

        int sum1 = sum.sum(a,b);
        System.out.println("a+b="+sum1);
    }

    interface Sum{
        public abstract int sum(int a,int b);
    }
}
