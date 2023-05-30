package day11.collections;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args){
        getCode();
    }
    public static void getCode() {
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arr.add((char) ('A'+i));
            arr.add((char) ('a'+i));
        }
        for (int i = 0; i < arr.size(); i++) {
            if (i < 10){
                arr1.add((Integer.toString(i)));
            }
            arr1.add(String.valueOf(arr.get(i)));
        }
        System.out.println(arr1.size()+""+arr1);//a-z A-Z

        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr1.size());
            code = code + arr1.get(index);
        }
        System.out.println(code);
	System.out.println();
    }
}
