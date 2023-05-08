package test2;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("张三2",24));
        list.add(new Student("李四",14));
        list.add(new Student("王五",15));

        filter(list);
        for(int i=0;i< list.size();i++){
            Student stu = list.get(i);
            System.out.println(stu.getName()+"---"+stu.getAge());
        }
    }

    private static void filter(ArrayList<Student> list) {
        for(int i=list.size()-1;i>=0;i--){//集合倒着遍历
            Student stu = list.get(i);
            if(stu.getAge()>18){
                list.remove(i);
            }
        }
    }
}
