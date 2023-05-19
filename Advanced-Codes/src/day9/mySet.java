package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class mySet {
    public static void main(String[] args){
        System.out.println("--------------HashSet---------------");//无序
        HashSet<Student> hashset = new HashSet<>();
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);
        Student stu4 = new Student("wangwu1",26);
        Student stu5 = new Student("wangwu2",27);

        hashset.add(stu1);
        hashset.add(stu2);
        hashset.add(stu3);
        hashset.add(stu4);
        hashset.add(stu5);

        System.out.println(hashset);

        for (Student stu : hashset){
            System.out.println(stu);
        }
        System.out.println(hashset.add(stu1));

        System.out.println("------------LinkedHashSet-----------------");//有序
        LinkedHashSet<Integer> list3 = new LinkedHashSet<>();
        list3.add(3);
        list3.add(1);
        list3.add(5);
        list3.add(9);
        list3.add(7);

        for(Integer i : list3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------TreeSet-------------");//自动排序
        TreeSet<Integer> list4 = new TreeSet<>();
        list4.add(3);
        list4.add(1);
        list4.add(5);
        list4.add(9);
        list4.add(7);

        System.out.print("增强for：");
        for(Integer i : list4){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.print("迭代器：");
        Iterator it = list4.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.print(obj+" ");
        }

        System.out.println();
        System.out.print("lambda表达式：");
        list4.forEach(integer ->System.out.print(integer+" "));

    }
}
