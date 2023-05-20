package day9;

import java.util.*;

public class mySet {
    public static void main(String[] args){
        System.out.println("--------------HashSet-Student---------------");//无序
        HashSet<Student> hashset = new HashSet<>();
        Student stu1 = new Student("zhangsan1",28);
        Student stu2 = new Student("lisi2",24);
        Student stu3 = new Student("wangwu3",25);
        Student stu4 = new Student("wangwu4",26);
        Student stu5 = new Student("wangwu4",26);

        hashset.add(stu4);
        hashset.add(stu1);
        hashset.add(stu2);
        hashset.add(stu3);
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
        System.out.println("------------LinkedHashSet-Student-----------------");
        LinkedHashSet<Student> list6 = new LinkedHashSet<>();
        list6.add(stu1);
        list6.add(stu2);
        list6.add(stu3);
        list6.add(stu4);
        list6.add(stu5);
        for(Student i : list6){
            System.out.println(i+" ");
        }

        System.out.println();
        System.out.println("----------------TreeSet-------------");
        //基本数据类型重写了Comparable接口方法，实现自动排序
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

        System.out.println();
        System.out.println("-------------------TreeSet-Student-Comparable--------------------");
        //自定义类在类中自己重写Comparable接口方法
        TreeSet<Student> list5 = new TreeSet<>();
        list5.add(stu3);
        list5.add(stu1);
        list5.add(stu2);
        list5.add(stu4);
        list5.add(stu5);
        for(Student i : list5){
            System.out.println(i+" ");
        }

        System.out.println();
        System.out.println("-------------------TreeSet-CompareTo--------------------");
        TreeSet<String> list7 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length()-o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
//ab c df qwer
        });

    }
}
