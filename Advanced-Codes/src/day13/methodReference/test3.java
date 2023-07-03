package day13.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class test3 {
    public static void main(String[] args){
        //1.创建两个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        for(Student student : students){
            System.out.println(student);
        }
    }
}
