package day2.minterface1;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        myInterface myInterface = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付方式：1.银行卡支付；2.信用卡支付；3.微信支付");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                myInterface = new yhk();
                break;
            case 2:
                myInterface = new xyk();
                break;
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
        System.out.println("请输入支付金额：");
        double pay = sc.nextDouble();
        myInterface.pay(pay);
    }
}
