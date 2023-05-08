package test2;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double money) {
        super(name,age,money);
    }

    public void work(){
        System.out.println("姓名为"+getName()+"，年龄为"+getAge()+"，工资为"+getMoney()+"的程序员正在编写代码...");
    }
}
