package day14.trycatch;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        GirlFriend girlFriend = new GirlFriend();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("请输入名字：");
                String name = sc.nextLine();
                girlFriend.setName(name);

                System.out.println("请输入年龄：");
                int age = Integer.parseInt(sc.nextLine());
                girlFriend.setAge(age);

                break;//有误则不会执行
            }catch (NumberFormatException e){
                e.printStackTrace();
            }catch (NameException e){
                e.printStackTrace();
            }catch (AgeException e){
                e.printStackTrace();
            }
        }

        System.out.println(girlFriend);
    }
}
