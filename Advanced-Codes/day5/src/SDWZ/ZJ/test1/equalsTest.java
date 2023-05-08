package SDWZ.ZJ.test1;

import java.util.ArrayList;
import java.util.Objects;

public class equalsTest {
    public static void main(String[] args){
        //重写equals方法
        Student stu1 = new Student(23,"张三");
        Student stu3 = null;
        Student stu2 = new Student(23,"张三");
        System.out.println(stu1.equals(stu2));
        Student stu4 = null;

        //重写toString方法
        //打印对象是调用了toString方法打印地址（哈希值），可以重写。
        //打印ArrayList集合也是重写了toString方法
        System.out.println(stu1);

        System.out.println(Objects.equals(stu3,stu2));
    }
}
