package day12.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 =  list.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList();
        Collections.addAll(list2,"zhangsan,23","lisi,24","wangwu,25");
        list2.stream()
                .filter(s -> 24 <= Integer.parseInt(s.split(",")[1]))
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                        ))
                .forEach((s,integer) -> System.out.println(s+integer));
    }
}
