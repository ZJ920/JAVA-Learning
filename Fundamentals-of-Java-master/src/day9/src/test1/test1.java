package day9.src.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        String getEnglish1="",getEnglish2="",getNum="",getString="";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.nextLine();
        char[] getInput = input.toCharArray();
        for (int i=0;i<getInput.length;i++){
            System.out.print("输入的字符串是："+getInput[i]);
            if('A'<= getInput[i] && getInput[i] <= 'Z'){
                getEnglish1 += getInput[i];
            }else if('a'<= getInput[i] && getInput[i] <= 'z'){
                getEnglish2 += getInput[i];
            }else if('0'<= getInput[i] && getInput[i] <= '9'){
                getNum += getInput[i];
            }else {
                getString += getInput[i];
            }
        }
        System.out.println("大写字母有"+getEnglish1.length()+"个："+getEnglish1);
        System.out.println("小写字母有"+getEnglish2.length()+"个："+getEnglish2);
        System.out.println("数字有"+getNum.length()+"个："+getNum);
        System.out.println("其它字符有"+getString.length()+"个："+getString);
    }
}
