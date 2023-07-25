package day17.io;

import java.io.*;
import java.nio.charset.Charset;

public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day17\\io\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Advanced-Codes\\src\\day17\\io\\csb-1.txt", Charset.forName("GBK")));

        int len;
        char[] ch = new char[1024];
        while ((len = br.read(ch)) != -1){
            bw.write(ch,0,len);
        }

        bw.close();
        br.close();
    }
}
