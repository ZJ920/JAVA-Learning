package day10.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Random;

public class MapDemo2 {
    public static void main(String[] args){
        Map<String,String> stu = new HashMap<>();//学号-选择
        int number=80;
        String[] arr = {"A","B","C","D"};
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int index = random.nextInt(arr.length);
            stu.put(Integer.toString(i+1),arr[index]);
        }

        //查看投票详情
        Set<Map.Entry<String,String>> entries = stu.entrySet();
        for (Map.Entry<String,String> entry : entries){

            System.out.println("学号为："+entry.getKey()+"的同学投了景区："+entry.getValue());
        }


    }

}
