package day17.io;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day17\\io\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Advanced-Codes\\src\\day17\\io\\csb-1.txt"));

        String str;
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        while ((str = br.readLine()) != null){
            String[] str1 = str.split("\\.");
            treeMap.put(Integer.parseInt(str1[0]),str1[1]);
        }

        Set<Map.Entry<Integer,String>>  entries = treeMap. entrySet();
        for (Map.Entry<Integer,String> entry : entries){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
            bw.write(entry.getKey()+"."+entry.getValue());
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
