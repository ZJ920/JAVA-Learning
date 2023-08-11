package day20.inetaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        InetAddress address = null;//主机
        int port = 0;//端口
        String str = null;

        while (true) {
            //接收数据包
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);//包装

            address = dp.getAddress();//
            byte[] data = dp.getData();//数据(二进制数)
            int len = dp.getLength();
            port = dp.getPort();
            str = new String(data,0,len);
            System.out.println("主机："+address+".端口:"+port+"数据："+str);
        }
    }
}
