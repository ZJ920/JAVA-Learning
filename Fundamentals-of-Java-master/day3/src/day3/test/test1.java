package day3.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int[] arr = getInts();
        int sum = getSum(arr);
        System.out.println("总成绩为：" + sum);
        int max = getMax(arr);
        System.out.println("最高分为："+ max);
    }

    private static int[] getInts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int count = sc.nextInt();
        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的成绩：");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int getSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
