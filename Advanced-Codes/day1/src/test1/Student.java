package test1;

public class Student extends Person{
    private double num;

    public Student(double num) {
        this.num = num;
    }

    public Student(String name, int age, double num) {
        super(name, age);
        this.num=num;
    }
    public String study(){
        String study = "正在学习...";
        return  study;
    }

    /**
     * 获取
     * @return num
     */
    public double getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(double num) {
        this.num = num;
    }
}
