package day9;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesSetDemo {
    public static void main(String[] args){

        StudentTest stu1 = new StudentTest("zhangsan",23,90,99,50);
        StudentTest stu2 = new StudentTest("lisi",24,90,98,50);
        StudentTest stu3 = new StudentTest("wangwu",25,95,100,30);
        StudentTest stu4 = new StudentTest("zhaoliu",26,60,99,70);
        StudentTest stu5 = new StudentTest("qianqi",26,70,80,70);

        TreeSet<StudentTest> tree = new TreeSet<>();

        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        tree.add(stu5);

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        for(StudentTest stu : tree){
            System.out.println(stu);
        }
    }
}
