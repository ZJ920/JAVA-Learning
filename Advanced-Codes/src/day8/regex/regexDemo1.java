package day8.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo1 {
    public static void main(String[] args){

        String regex1 = "[a-zA-Z0-9_]{4,16}";
        System.out.println("zhangsan".matches(regex1));
        String regex2 = "[1-9]\\d{16}([0-9]|X|x)";
        System.out.println("51132420000920085x".matches(regex2));

        System.out.println("-------------------------");

        String s= "java-java17-java8-Java11";
        String regex3 = "((?i)java)(?=8|11|17)";
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
