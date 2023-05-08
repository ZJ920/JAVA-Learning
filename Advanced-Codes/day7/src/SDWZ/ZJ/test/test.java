package SDWZ.ZJ.test;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class test {
    public static void main(String[] args){
        LocalDateTime time = LocalDateTime.now();
        //现在的时间
        System.out.println(time);
        LocalDateTime time1 = LocalDateTime.of(2000,9,20,12,20,56);
        //自己设置的时间，并包装成时间对象time1
        System.out.println(time1);
        System.out.println(time1.plusDays(1));
        //判断时间前后
        System.out.println(time1.isBefore(time));
        System.out.println(time1.isAfter(time));
        //判断时间是否相等
        System.out.println(time1.equals(time));

    }
}
