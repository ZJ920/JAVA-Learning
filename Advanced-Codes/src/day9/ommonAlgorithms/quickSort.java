package day9.ommonAlgorithms;

public class quickSort {
    //快速排序
    public static void quickSort(int[] arr,int start,int end){
        if (start > end){
            return ;
        }
        int temp;
        int i = start;
        int j = end;
        int indexNum = arr[i];

        //找索引并交换数据
        while (i != j){
            while (true){//找到右边第一个小于indexNum的数记录其索引（end）
                if (j<= i || arr[j] < indexNum){
                    break;
                }
                j--;
            }
            while (true){//找到左边边第一个大于indexNum的数记录其索引（start）
                if (i >= j || arr[i] > indexNum){
                    break;
                }
                i++;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //将基准为与i和j相等位置的数字交换
        temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;

        //递归调用左半数组
        quickSort(arr,start,i-1);
        //递归调用右半数组
        quickSort(arr,i+1,end);
    }
}
