package day6.src.SDWZ.ZJ.TEST;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class mySort {
    public static void main(String[] args) {
        int[] a = {9, 2, 8, 1, 4, 7, 2};
        int[] a1 = {9, 2, 8, 1, 4, 7, 2};
        int found = 2;

        //冒泡排序
        bubbleSort(a);

        //选择排序
        selectSort(a1);

        //二分查找
        int[] indexInt = binarySearch(a, found);
        if (indexInt[0] != -1){
            for (int i = 0; i < indexInt.length; i++) {
                System.out.print(indexInt[i]+" ");
            }
        }else {
            System.out.println("查找失败...");
        }
    }

    //二分查找
    private static int[] binarySearch(int[] a, int found) {
        int min = 0;
        int max = a.length - 1;
        int mid;

        StringBuilder index = new StringBuilder();
        while (min <= max) {
            mid = (min + max) / 2;
            if (found < a[mid]) {
                max = mid - 1;
            } else if (found > a[mid]) {
                min = mid + 1;
            } else if (found == a[mid]) {
                index.append(mid);
                int temp = mid;

                //找mid左边
                for (int i = 0; i < mid; i++) {
                    //循环mid次
                    if (found == a[mid - 1 - i]) {
                        index.append(a[mid - 1 - i]);
                    } else {
                        break;
                    }
                }

                //找mid右边
                mid = temp;
                for (int i = a.length - 1; i > mid; i--) {
                    //循环max-mid次
                    if (found == a[mid + 1 + (a.length - 1) - i]) {
                        index.append(a[mid + 1 + (a.length - 1) - i]);
                    } else {
                        break;
                    }
                }

                //将得到的StringBuilder对象（index）->String->char->StringBuilder(index1)->String->int
                String indexString = index.toString();
                char[] indexChar = indexString.toCharArray();
                int[] indexInt = new int[indexChar.length];
                for (int i = 0; i < indexChar.length; i++) {
                    StringBuilder index1 = new StringBuilder();
                    index1.append(indexChar[i]);
                    String s = index1.toString();
                    indexInt[i] = Integer.parseInt(s);
                }

                return indexInt;
            }
        }
        //走到这步说明没有找到返回不存在的索引-1
        int[] indexInt = new int[]{-1};
        return indexInt;
    }


    //冒泡排序
    private static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >= a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println("a:" + Arrays.toString(a));
    }

    //选择排序
    private static void selectSort(int[] a1) {
        int temp;
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] >= a1[j]) {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
        }
        System.out.println("a1:" + Arrays.toString(a1));
    }
}
