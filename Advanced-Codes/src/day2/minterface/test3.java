package day2.minterface;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int number2 = sc.nextInt();
        max=number1 > number2 ? number1 : number2;
        System.out.println("最大值为："+max);
    }
}
