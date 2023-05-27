package day11.collections;

import java.util.*;

public class Demo1 {
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"1","2","3","4");
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,"5","6","7","8");
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2,"9","10","11","12");

        map.put("四川",arrayList);
        map.put("重庆",arrayList1);
        map.put("江苏",arrayList2);

        Set<Map.Entry<String , ArrayList<String>>> entries = map.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringBuilder sb = new StringBuilder();

            sb.append(entry.getKey()+" = ");

            ArrayList<String> list = entry.getValue();
            for(String s : list){
                sb.append(s).append(",");
            }

            System.out.println(sb);
        }


    }
}
