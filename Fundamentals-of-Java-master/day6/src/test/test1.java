package test;
//基本数据类型：比较数据值
//引用数据类型：比较地址值
//比较数组
public class test1 {
    public static void main(String[] args){
        int[] arr1={11,22,33};
        int[] arr2={11,22,33};
        boolean num = testNum(arr1 ,arr2);
        System.out.println(num);
    }
    public static boolean testNum(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
