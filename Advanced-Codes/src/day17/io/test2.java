package day17.io;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day17\\io\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Advanced-Codes\\src\\day17\\io\\b-1.txt"));

//        int len;
//        char[] chars = new char[1024];
//        while ((len = br.read(chars)) != -1){
//            bw.write(chars,0,len);
//        }
        String len;
        while (( len = br.readLine()) != null){
            bw.write(len);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
