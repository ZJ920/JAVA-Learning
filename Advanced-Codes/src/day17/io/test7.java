package day17.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Advanced-Codes\\src\\day17\\io\\a.txt"));

        ArrayList<Student> arrayList = (ArrayList<Student>) ois.readObject();

        System.out.println(arrayList);
    }
}