package day17.io;

import java.io.*;
import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("张三",23,"南京");
        Student stu2 = new Student("李四",23,"重庆");
        Student stu3 = new Student("王五",23,"四川");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Advanced-Codes\\src\\day17\\io\\a.txt"));

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(stu);
        arrayList.add(stu2);
        arrayList.add(stu3);
        oos.writeObject(arrayList);

        oos.close();

    }
}
