package day10.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo4 {
    public static void main(String[] args){
        TreeMap<Integer , String> shopMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i = o2-o1 ;
                return i;
            }
        });

        shopMap.put(3,"西瓜");
        shopMap.put(1,"李子");
        shopMap.put(2,"芒果");
        shopMap.put(4,"桃子");
        shopMap.put(5,"橘子");

        System.out.println(shopMap);
    }
}
