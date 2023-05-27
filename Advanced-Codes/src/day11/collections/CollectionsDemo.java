package day11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set,1,2,567,3,1,4,0);
        System.out.println("set："+set);
        Collections.addAll(list,1,2,7,3,0,24,55,8,23);
        System.out.println("list:"+list);
        Collections.shuffle(list);
        System.out.println("打乱list:"+list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2 > 0 ? -1 : 1;
            }
        });
        System.out.println("从大到小list:"+list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2 > 0 ? 1 : -1;
            }
        });
        System.out.println("从小到大list:"+list);
        System.out.println("查找1："+Collections.binarySearch(list,1));
        System.out.println("查找23："+Collections.binarySearch(list,23));
    }
}
