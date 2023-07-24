package day16.io;

import java.io.FileReader;
import java.io.IOException;

public class test6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Advanced-Codes\\src\\day16\\io\\a.txt");

        int le;
        char[] chars = new char[2];
        while (( le = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,le));
        }
        fr.close();
    }
}
