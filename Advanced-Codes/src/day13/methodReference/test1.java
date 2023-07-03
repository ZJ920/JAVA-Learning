package day13.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args){
        //1.创建两个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        ArrayList<Student> arrayList = (ArrayList<Student>) list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name,age);
            }
        }).collect(Collectors.toList());
        for(Student students : arrayList){
            System.out.println(students);
        }
        System.out.println("---------------------------------------");
        ArrayList<Student> arrayList1 =
                (ArrayList<Student>) list.stream()
                .map(Student::new)
                .collect(Collectors.toList());
        for(Student students : arrayList1){
            System.out.println(students);
        }
    }
}
