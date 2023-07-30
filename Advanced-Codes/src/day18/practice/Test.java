package day18.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day18\\practice\\names.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //2.计算权重的总和:9.5
        double weight = 0;
        for (Student stu : list) {
            weight = weight + stu.getWeight();
        }

        //3.计算每一个人的实际占比
        //[0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1]
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student stu : list) {
            arr[index] = stu.getWeight() / weight;//0.05/9.5
            index++;
        }

        //4.计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        //5.随机抽取
        //获取一个0.0~1.0之间的随机数
        double number = Math.random();
        //判断number在arr中的位置
        //二分查找法
        //方法回返回： - 插入点 - 1
        //获取number这个数据在数组当中的插入点位置
        int result = -Arrays.binarySearch(arr, number) - 1;
        Student stu = list.get(result);
        System.out.println(stu);

        //6.修改当前学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

       //7.把集合中的数据再次写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("Advanced-Codes\\src\\day18\\practice\\names.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();


    }
}
