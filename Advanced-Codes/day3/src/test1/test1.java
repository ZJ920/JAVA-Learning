package test1;

public class test1 {//静态代码块
    static String student;//除了String还可以是其它对象等。
    static {
        String student = "张三";//还可以对 对象初始化 等复杂初始化
    }
}
