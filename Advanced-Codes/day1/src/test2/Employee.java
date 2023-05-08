package test2;

public class Employee {
    private String name;
    private int age;
    private double money;

    public Employee() {
    }

    public Employee(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void work(){
        System.out.println("员工工作");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }
}
