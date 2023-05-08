package SDWZ.ZJ.test1;

import java.util.Objects;

public class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    //重写equals方法
//    public boolean equals(Object obj) {
//        //向下转型
//        Student stu = (Student) obj;
//        return this.age == stu.age && this.name == stu.name;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //重写了toString方法
    @Override
    public String toString() {
        return "Student{age = " + age + ", name = " + name + "}";
    }
}
