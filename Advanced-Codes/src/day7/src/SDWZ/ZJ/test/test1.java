package day7.src.SDWZ.ZJ.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月（格式：xxxx-xx-xx）：");
        String birthday = sc.nextLine();
        //创建一个格式对象，将其和birthday传入parse（）方法封装为LocalDate日期变量
        LocalDate birthdayDate = LocalDate.parse(birthday,DateTimeFormatter.ofPattern("yyyy-M-d"));
        LocalDate now = LocalDate.now();
        long time = ChronoUnit.YEARS.between(birthdayDate,now);
        System.out.println("你的年龄为："+time);
    }
}
