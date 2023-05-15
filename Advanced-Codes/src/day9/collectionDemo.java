package day9;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        //Collection<String> coll = new ArrayList<>();//多态写法，可以直接使用上面的写法
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        System.out.println(arrayList);

        //      清空
        //      arrayList.clear();
        //      System.out.println(arrayList);

        //删除
        System.out.println(arrayList.remove("bbb"));
        System.out.println(arrayList);


        System.out.println(arrayList.contains("ccc"));


        System.out.println(arrayList.isEmpty());


        System.out.println(arrayList.size());
        System.out.println("--------------------------");

        Collection<Student> stu = new ArrayList<Student>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",21);
        Student stu3 = new Student("王五",19);
        Student stu4 = new Student("王五",19);
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);

        System.out.println(stu.contains(stu4));
    }
}
