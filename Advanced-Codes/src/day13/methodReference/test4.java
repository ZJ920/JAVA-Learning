package day13.methodReference;

import java.util.ArrayList;
import java.util.function.Function;

public class test4 {
    public static void main(String[] args){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("zhangsan",23));
        arrayList.add(new Student("lisi",24));
        arrayList.add(new Student("wangwu",25));

        String[] students = arrayList.stream().map(Student::getName).toArray(String[]::new);
        for(String str : students){
            System.out.println(str);
        }
    }
}
