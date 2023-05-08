package test1;

public class test4 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("a");
        StringBuilder sb2 = sb.append("b");
        StringBuilder sb3 = sb.append("c");
        StringBuilder sb4 = sb.append("d");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb == sb1);
        System.out.println(sb1 == sb2);
        System.out.println(sb2 == sb3);
        System.out.println(sb3 == sb4);
        System.out.println(sb4 == sb);
    }
}
