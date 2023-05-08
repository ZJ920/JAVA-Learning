package test2;

public class Manager extends Employee{
    private double money1;
    public Manager() {
    }

    public Manager(String name, int age, double money,double money1) {
        super(name, age, money);
        this.money1 = money1;
    }

    @Override//方法重写
    public void work() {
        //默认调用super.work();方法
        System.out.println("姓名为"+getName()+"，年龄为"+getAge()+"，工资为"+getMoney()+"，奖金为"+money1+"的项目经理正在分配任务...");
    }
    /**
     * 获取
     * @return money1
     */
    public double getMoney1() {
        return money1;
    }

    /**
     * 设置
     * @param money1
     */
    public void setMoney1(double money1) {
        this.money1 = money1;
    }
}
