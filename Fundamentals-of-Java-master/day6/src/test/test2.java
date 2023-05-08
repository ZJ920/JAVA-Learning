package test;

import java.util.Random;

//随机获取验证码
public class test2 {
    public static void main(String[] args){
        char[] zfc = getChars();//获取验证码范围
        getYzm(zfc);//获取验证码
    }

    private static char[] getChars() {
        char[] zfc = new char[26+26+10];
        int index=0;
        for(char a='a';a<='z';a++){
            zfc[index]=a;
            index++;
        }
        for(char a='A';a<='Z';a++){
            zfc[index]=a;
            index++;
        }
        for(char a='0';a<='9';a++){
            zfc[index]=a;
            index++;
        }
        System.out.print("验证码获取范围为：");
        System.out.println(zfc);
        return zfc;
    }

    private static void getYzm(char[] zfc) {
        Random r = new Random();
        String yzm = "";
        for(int i=0;i<5;i++){
            int getIndex = r.nextInt(zfc.length);
            yzm += zfc[getIndex];
        }
        System.out.println("验证码为：" + yzm);
    }

}
