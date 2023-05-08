package test2;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args){
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",14);
        Student stu3 = new Student("王五",25);
        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "；"+"年龄：" + stu.getAge());
        }
    }
}
