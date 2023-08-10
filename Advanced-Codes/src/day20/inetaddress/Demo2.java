package day20.inetaddress;

import java.io.IOException;
import java.net.*;

public class Demo2{
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String str = "hello";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();
    }
}
