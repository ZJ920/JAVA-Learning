package SDWZ.ZJ.Library;

public class myWindow {
    public static void main(String[] args) {
        Test win1=new Test();
//        System.out.println("要传过去的win1对象为："+win1);
        win1.init("图书管理系统",win1);//将win1传过去目的是在登录成功后释放登录窗
    }
}