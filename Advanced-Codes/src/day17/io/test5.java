package day17.io;

import java.io.*;

public class test5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("张三",23,"南京");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Advanced-Codes\\src\\day17\\io\\a.txt"));

        oos.writeObject(stu);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Advanced-Codes\\src\\day17\\io\\a.txt"));

        Object o = ois.readObject();

        System.out.println(o);
    }
}
