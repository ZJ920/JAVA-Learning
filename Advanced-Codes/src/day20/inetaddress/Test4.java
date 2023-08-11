package day20.inetaddress;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test4 {
    //客户端
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",16227);
        OutputStream os = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入：");
            String str = sc.nextLine();

            if ("Q".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        //结束标记:OutputStream os = socket.getOutputStream();
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int a;
        while ((a = isr.read()) != -1){
            System.out.print((char) a);
        }

        is.close();
        os.close();
        socket.close();
    }
}
