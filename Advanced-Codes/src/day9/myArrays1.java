package day9;

import java.util.ArrayList;

public class myArrays1 {

    private myArrays1(){}

    public static <E> void addAll(ArrayList<E> lis,E e1,E e2,E e3){
        lis.add(e1);
        lis.add(e2);
        lis.add(e3);
    }
    public static <E> void show(ArrayList<E> list){
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0){
                System.out.print("list:[");
            }
            System.out.print(list.get(i)+"、");
            if (i == list.size()-1){
                System.out.println("]");
            }
        }
    }

    public static <E> void makeFor(ArrayList<E> e){
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).equals("张三")){
                e.remove(e.get(i));
            }
            System.out.println(i+":"+e.get(i));
        }
    }
}
