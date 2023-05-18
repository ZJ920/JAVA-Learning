package day9;

import java.util.ArrayList;

public class myArrays1 {

    private myArrays1(){}

    public static <E> void addAll(ArrayList<E> lis,E e1,E e2){
        lis.add(e1);
        lis.add(e2);
    }
    public static <E> void show(ArrayList<E> list){
        System.out.println(list);
    }
}
