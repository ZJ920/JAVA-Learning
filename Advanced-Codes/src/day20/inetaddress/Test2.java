package day20.inetaddress;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Test2{
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        int port = 10086;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("请输入：");
            String str = scanner.nextLine();

            if ("Q".equals(str)){
                break;
            }

            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);
        }

        ds.close();
    }
}
