package day8.test4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Instant 类 ：存储了一个从1970-01-01 00:00:00 以来的 秒 和 纳秒 数据
 * 实际上就是一个时间戳类
 * System.currentTimeMillis() ： 获取的是毫秒
 *
 * Instant 类的 getEpochSecond() : 获取的是秒
 * Instant 类的 toEpochMilli() : 获取的是毫秒，同 System.currentTimeMillis()
 * Instant 类的 getNano() : 获取的是纳秒，更精确了
 *
 */
public class InstantTest {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象
        Instant now01 = Instant.now();
        System.out.println(now01);
        System.out.println("纪元秒 ： "+now01.getEpochSecond());
        System.out.println("时间戳 ： "+System.currentTimeMillis());
        System.out.println("毫  秒 ： "+now01.toEpochMilli());
        System.out.println("纳  秒 ： "+now01.getNano());

        System.out.println("===========================");

        // 2.获取指定时间的Instant对象
        Instant instant01 = Instant.ofEpochSecond(100);
        System.out.println(instant01);
        System.out.println("纪元秒 ： "+instant01.getEpochSecond());
        System.out.println("毫  秒 ： "+instant01.toEpochMilli());
        System.out.println("纳  秒 ： "+instant01.getNano());
        System.out.println("===========================");

        //3.指定时间戳创建 带时区的日期时间对象 ZoneDateTime
        Instant instant02 = Instant.ofEpochSecond(1647784071); // 2022-03-20 21:47:51
        ZonedDateTime zonedDateTime = instant02.atZone(ZoneId.of("Asia/Shanghai"));
        Instant instant03 = Instant.now();
        ZonedDateTime zonedDateTime1 = instant03.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zonedDateTime = " + zonedDateTime1);
        System.out.println("===========================");

        // 4.指定时间戳创建  默认时区的日期时间对象 LocalDateTime
        Instant instant04 = Instant.ofEpochSecond(1647784071); // 2022-03-20 21:47:51
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant04, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("===========================");

    }
}
