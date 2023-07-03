package day13.methodReference;

import java.util.ArrayList;

public class test5 {
    public static void main(String[] args){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("张三",23));
        arrayList.add(new Student("李四",24));
        arrayList.add(new Student("王五",25));

        String[] nameAndAgeArray = arrayList.stream()
                .map(test5::concatNameAndAge)  // 使用方法引用
                .toArray(String[]::new);

        for (String str : nameAndAgeArray) {
            System.out.println(str);
        }
    }
    public static String concatNameAndAge(Student student) {
        return student.getName() + "-" + student.getAge();
    }
}
