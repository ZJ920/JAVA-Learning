package day9.src.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        addStudent(list, sc);

        for (int i = 0; i < list.size(); i++) {
            Student stu1 = list.get(i);
            System.out.println("姓名：" + stu1.getName() + "；"+"年龄：" + stu1.getAge());
        }

    }

    private static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.print("请输入录入的学生数：");
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++){
            System.out.println("请输入第"+(i+1)+"个学生信息");
            System.out.print("请输入学生姓名：");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();

            Student stu = new Student();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
    }
}
