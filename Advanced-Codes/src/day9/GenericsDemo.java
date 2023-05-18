package day9;

public class GenericsDemo {
    public static void main(String[] args) {
        myArrays<Student> stu = new myArrays();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        System.out.println(stu.get(1));
        System.out.println(stu);
    }
}

