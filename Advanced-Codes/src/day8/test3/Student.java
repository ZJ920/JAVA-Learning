package day8.test3;

public class Student {
    String name;
    int age;

    public Student(){

    }
    public Student(String name, int age){
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        if (name==null){
            return null;
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
