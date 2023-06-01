package day12.Stream;

import java.util.*;

public class Demo1 {
    public static void main(String[] args){
        List<String> arr1 = List.of("张三","李四","王五");
        HashMap<String,String> map = new HashMap<>();
        map.put("张三","24");
        map.put("李四","25");
        map.put("王五","26");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Map.Entry[] mapArr = new Map.Entry[0];
        Map.Entry[] mapArr1 = entries.toArray(mapArr);
        Map fainMap = Map.ofEntries(mapArr1);
        //fainMap.put("1","1");
        System.out.println(fainMap);

    }
}
