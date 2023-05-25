package day10.map;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Character , Integer> treeMap = new TreeMap<>();
        String s = "aaabbbjjjkdbss" ;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (treeMap.containsKey(a)){
                int count = treeMap.get(a);
                count++;
                treeMap.put(a,count);
            }else {
                treeMap.put(a,1);
            }
        }

        StringBuilder sb = new StringBuilder();
        treeMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });

        System.out.println(sb);
    }
}
