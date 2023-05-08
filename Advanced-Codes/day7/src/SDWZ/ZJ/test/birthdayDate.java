package SDWZ.ZJ.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class birthdayDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你的生日(格式：XXXX年XX月XX日)：");
         String birthday = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = simpleDateFormat.parse(birthday);
        Date todayDate = new Date();
        //getTime返回毫秒值
        long time = (todayDate.getTime()-birthdayDate.getTime())/1000/60/60/24;
        System.out.println("你来到这个世界已经："+time+"天");
    }
}
