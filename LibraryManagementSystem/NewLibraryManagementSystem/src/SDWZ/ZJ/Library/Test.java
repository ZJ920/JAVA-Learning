package SDWZ.ZJ.Library;

public class Test {
    public static void main(String[] args) {
        Logon win1=new Logon();
//        System.out.println("要传过去的win1对象为："+win1);
        win1.init("图书管理系统",win1);//将win1传过去目的是在登录成功后释放登录窗
    }
}