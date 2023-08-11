package day20.inetaddress;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Test3{
    public static void main(String[] args) throws IOException {
        //组播发送数据
        MulticastSocket ms = new MulticastSocket();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入：");
            String str = scanner.nextLine();

            if ("Q".equals(str)){
                break;
            }

            //打包数据
            int port = 8888;
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("224.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            //发送数据
            ms.send(dp);
        }

        ms.close();
    }
}
