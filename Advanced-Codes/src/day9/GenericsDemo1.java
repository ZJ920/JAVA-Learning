package day9;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args){
        ArrayList<String> lis = new ArrayList<>();
        myArrays1.addAll(lis,"张三","李四");
        myArrays1.show(lis);

        ArrayList<Integer> lis1 = new ArrayList<>();
        myArrays1.addAll(lis1,1,2);
        myArrays1.show(lis1);
    }
}
