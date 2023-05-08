package day9.src.test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //extracted(sc);
        extracted2();

    }

    private static void extracted2() {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("abc").append(true).append(12.2);//拼接任意类型
        System.out.println(sb);//abctrue12.2
    }
    private static void extracted(Scanner sc) {
        System.out.println("请输入：");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(input);
        System.out.println(sb);
        if(input.equals(sb.toString())){
            System.out.println("是回文数字");
        }else {
            System.out.println("不是回文数字");
        }
    }
}
