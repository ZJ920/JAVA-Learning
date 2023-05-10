package day5.src.SDWZ.ZJ.test1;

import java.util.ArrayList;

public class doubleNum {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);

        String s = "60,20,30,40,50";
        String[] sArr = s.split(",");
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i] + " ");
        }
        System.out.println();

        int[] num = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            num[i] = Integer.parseInt(sArr[i]);
        }
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(max);
        System.out.println("--------");
        String s1 = "111";
        s1 = "222";
        System.out.println(s1);
        int a1 = 128;
        Integer integer = new Integer(a1);
        System.out.println(integer);

        Integer[] a2;
        int[] a3;

        Student stu = new Student();
        System.out.println(stu.getClass());
        Class cla = stu.getClass();
        System.out.println(cla);
        System.out.println(stu.getClass().getInterfaces());
    }

}
