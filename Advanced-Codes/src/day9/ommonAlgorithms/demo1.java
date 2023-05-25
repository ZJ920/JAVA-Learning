package day9.ommonAlgorithms;

import java.util.Arrays;

//插入、快速排序，递归
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 91, 23, 45, 77, 28, 33, 67};
        int[] arr2 = {3, 44, 38, 91, 23, 45, 77, 28, 33, 67};

        //递归求和、阶乘
        System.out.println(getNum.getNum(4, false));//和
        System.out.println(getNum.getNum(4, true));//阶乘

        System.out.println("排序前arr、arr2:" +Arrays.toString(arr));

        //插入排序
        extracted.extracted(arr);

        //快速排序
        quickSort.quickSort(arr2, 0, arr2.length - 1);
        System.out.print("快速排序arr2：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
