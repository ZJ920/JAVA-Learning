package day1.test1;

public class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teach(){
        System.out.println(super.getName()+"，一位"+super.getAge()+"岁的老师正在讲课...");
        System.out.println(getName()+"，一位"+getAge()+"岁的老师正在讲课...");
    }
}
