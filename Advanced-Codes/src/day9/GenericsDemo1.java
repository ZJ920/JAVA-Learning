package day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class GenericsDemo1 {
    public static void main(String[] args){
        ArrayList<String> lis = new ArrayList<>();
        myArrays1.addAll(lis,"张三","李四","王五");
        myArrays1.show(lis);

        ArrayList<Integer> lis1 = new ArrayList<>();
        myArrays1.addAll(lis1,1,2,3);
        myArrays1.show(lis1);

        myArrays1.makeFor(lis);

        System.out.println("---------------------------");

        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c");
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            if (Objects.equals(sb.charAt(i),'a')){
                sb.deleteCharAt(i);
            }
            System.out.println(i+":"+sb.charAt(i));
        }
        sb.deleteCharAt(0);

    }
}
