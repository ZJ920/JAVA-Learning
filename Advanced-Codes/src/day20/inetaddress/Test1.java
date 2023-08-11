package day20.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("z");

        String hostName = address.getHostName();//
        String ip = address.getHostAddress();

        System.out.println(address);
        System.out.println(hostName);
        System.out.println(ip);
    }
}
