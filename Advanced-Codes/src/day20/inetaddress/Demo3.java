package day20.inetaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Demo3 {
    public static void main(String[] args) throws IOException {

        MulticastSocket ms = new MulticastSocket(8888);

        //将当前主机添加到224.0.0.1组中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        int port = -1;//端口
        String str = null;

        while (true) {
            //接收数据包
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ms.receive(dp);//包装

            address = dp.getAddress();//
            byte[] data = dp.getData();//数据(二进制数)
            int len = dp.getLength();
            port = dp.getPort();
            str = new String(data,0,len);
            System.out.println("主机："+address+".端口:"+port+"数据："+str);
        }
    }
}
