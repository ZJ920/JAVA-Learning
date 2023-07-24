package day16.io;

import java.io.FileReader;
import java.io.IOException;

public class test5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Advanced-Codes\\src\\day16\\io\\a.txt");

        int ch;
        while (( ch = fr.read()) != -1){
            System.out.println(ch+":"+(char)ch);
        }
    }
}
