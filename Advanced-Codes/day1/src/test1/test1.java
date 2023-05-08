package test1;

public class test1 {
    public static void main(String[] args){
        Teacher tea = new Teacher("李四",30);
        Student stu = new Student("张三",15,100.0);
        tea.teach();
        System.out.println(stu.getName()+"，一位"+stu.getAge()+"岁的学生"+stu.study()+"学习成绩"+stu.getNum());
    }
}
