package test1;

import java.util.Scanner;

public class test {
      public static void main(String[] args){
          String name = "admin";
          String password = "123456";

          Scanner sc = new Scanner(System.in);

          for (int i=0;i<3;i++){
              System.out.println("请输入用户名：");
              String username = sc.nextLine();
              System.out.println("请输入密码：");
              String userPassword = sc.nextLine();
              if(name.equals(username) && password.equals(userPassword)){
                  System.out.println("登录成功！");
                  break;
              }else {
                  if (i == 2){
                      System.out.println("今日机会已用完，请明日再来。");
                  }else {
                      System.out.println("登录失败，今日你还有"+(2-i)+"次机会。");
                  }
              }
          }
      }
}
