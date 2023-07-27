package day17.io;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 5872271831209402944L;
    private String name;
    private int age;
    private transient String local;

    public Student(String name, int age, String local) {
        this.name = name;
        this.age = age;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", local='" + local + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
