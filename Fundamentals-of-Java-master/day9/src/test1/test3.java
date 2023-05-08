package test1;

class Object1 {
    private String i;

    Object1(String a) {    //类Object的构造方法
        i = a;
    }

    Object1 num(String i) {
        this.i += i;
        return this;
    }

    /**
     * 获取
     *
     * @return i
     */
    public String getI() {
        return i;
    }

    /**
     * 设置
     *
     * @param i
     */
    public void setI(String i) {
        this.i = i;
    }
}
    public class test3 {
    public static void main(String[] args) {
        Object1 o1 = new Object1("a");    //调用构造方法创建对象
        Object1 o2 = o1.num("b");
        o2=o2.num("c");
        System.out.println("o1的地址："+o1);//o1保存的地址
        System.out.println("o2的地址："+o2);
        System.out.println(o1.getI());
        System.out.println(o2.getI());
    }
}