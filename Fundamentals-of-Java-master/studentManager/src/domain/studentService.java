package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class studentService {
    //开始
    public void start(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.查看学生");
            System.out.println("2.添加学生信息");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> queryStudentInfos(list);
                case 2 -> addStudent(list);
                case 3 -> deleteStudentById(list);
                case 4 -> updateStudentInfoById(list);
                case 5 -> {
                    System.out.println("感谢你的使用，再见。");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    //查看学生信息
    private void queryStudentInfos(ArrayList<Student> list) {
        if(list.size() == 0){
            System.out.println("暂无学生信息！");
        }else{
            System.out.println("学号\t姓名\t年龄\t生日");
            for (int i=0;i< list.size();i++){
                Student stu = list.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
            }
        }
    }

    //删除学生信息
    private void deleteStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.next();
        int index = getIndex(id,list);//传入id和list，从list中找到id的index。
        if (index == -1){
            System.out.println("没有找到该学生信息，删除失败，请检查后重试。");
        }else{
            Student stu = list.get(index);
            list.remove(index);
            System.out.println("删除成功！");
            System.out.println("删除的学生信息是：");
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
        }
    }

    //修改学生信息
    private void updateStudentInfoById(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生学号：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(id,list);//传入id和list，从list中找到id的index。

        if (index == -1){
            System.out.println("没有找到该学生信息，请检查后重试。");
        }else{
            System.out.println("查找成功，请修改：");
            Student stu = list.get(index);
            System.out.println("请输入学生学号：");
            String setId = sc.next();
            System.out.println("请输入学生姓名：");
            String setName = sc.next();
            System.out.println("请输入学生年龄：");
            int setAge = sc.nextInt();
            System.out.println("请输入学生出生年月日：");
            String setBirthday = sc.next();

            Student stu1 = new Student(setId,setName,setAge,setBirthday);
            list.set(index,stu1);//修改学生信息

            System.out.println("修改成功！");
            System.out.println("学生信息由：");
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
            System.out.println("修改为：");
            System.out.println(stu1.getId()+"\t"+stu1.getName()+"\t"+stu1.getAge()+"\t"+stu1.getBirthday());
        }
    }

    //添加学生信息
    private void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        boolean judge;//判断
        do {
            System.out.println("请输入要添加的学生信息：");

            System.out.println("请输入学生学号：");
            String setId = sc.next();
            System.out.println("请输入学生姓名：");
            String setName = sc.next();
            System.out.println("请输入学生年龄：");
            int setAge = sc.nextInt();
            System.out.println("请输入学生出生年月日：");
            String setBirthday = sc.next();

            int index = getIndex(setId,list);//传入id和list，从list中找到id的index。

            if (index == -1){
                Student stu = new Student(setId,setName,setAge,setBirthday);
                list.add(stu);

                System.out.println("添加成功！");
                System.out.println("添加的学生信息是：");
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
                System.out.println("是否继续添加学生信息：输入1继续添加或输入任意数字结束添加 ");
                int choice = sc.nextInt();
                if (choice == 1){
                    judge = false;
                }else {
                    judge = true;
                }
            }else{
                System.out.println("已存在该学号的学生信息，请重新输入。");
                judge = false;
            }
        } while (judge==false);
    }

    //传入id和list，从list中找到id的index。
    private int getIndex(String id,ArrayList<Student> list) {
        for (int i=0;i< list.size();i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;//没有找到返回-1
    }
}


