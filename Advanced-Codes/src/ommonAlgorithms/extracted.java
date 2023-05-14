package ommonAlgorithms;

public class extracted {

    //插入排序
    public static void extracted(int[] arr) {
        int index = -1;
        int j, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                index = i + 1;
                break;
            }
        }
        for (int i = index; i < arr.length; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.print("插入排序arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
