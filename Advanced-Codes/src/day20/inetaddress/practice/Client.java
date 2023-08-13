package day20.inetaddress.practice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    //客户端
    public static void main(String[] args) throws IOException {

        //获取连接通道 ip:127.0.0.1 目的地端口：16227
        Socket socket = new Socket("127.0.0.1", 16227);
        //创建输出流
        OutputStream os = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================聊天室====================");

        while (true) {
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请输入你的选择：");
            String str = scanner.nextLine();
            if ("1".equals(str)) {
                //登录
                registerAndLogin("1.",scanner, os, socket);
                break;
            } else if ("2".equals(str)) {
                //注册
                boolean temp = registerAndLogin("2.",scanner, os,socket);
                if (temp){
                    System.out.println("注册成功，请登录");
                    registerAndLogin("1.",scanner, os, socket);
                }else {
                    System.out.println("注册失败");
                }
            } else {
                System.out.println("输入有误，请重新输入:1.登录;2.注册");
                System.out.println("--------------------------------------------");
            }
        }

        // 关闭输出流，通知服务器数据发送完毕
        /*用于关闭套接字的输出流，表示不再发送数据。
          这样做可以通知服务器端数据发送完毕，
          并且服务器端会收到一个 EOF（End of File）信号，
          从而避免服务器端认为连接被重置。
         */
        socket.shutdownOutput();
        // 关闭连接
        os.close();
        socket.close();
    }


/*    public static void login(Scanner scanner, OutputStream os, Socket socket) throws IOException {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("请输入用户名：");
            String userName = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            //只能由字母、数字组成1-10位
            String regex = "^[a-zA-Z0-9]{1,10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (userName.length() > 10 || !matcher.matches()) {
                System.out.println("用户名过长或密码格式错误，请重新输入");
            } else {
                //选项标识+用户名+密码
                String data = "1." + "userName=" + userName + "&" + "password=" + password;
                os.write(data.getBytes());

                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                int a;
                while ((a = isr.read()) != -1) {
                    System.out.print((char) a);
                }
                is.close();
                //socket.close();
                break;
            }
        }
    }
*/
    //注册、登录
    public static boolean registerAndLogin(String index,Scanner scanner, OutputStream os,Socket socket) throws IOException {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("请输入用户名：");
            String userName = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            //只能由字母、数字组成1-10位
            String regex = "^[a-zA-Z0-9]{1,10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (userName.length() > 10 || !matcher.matches()) {
                System.out.println("用户名过长或密码格式错误，请重新输入");
            } else {
                //选项标识+用户名+密码
                String data = index + "userName=" + userName + "&" + "password=" + password;
                os.write(data.getBytes());

                socket.shutdownOutput();

                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                String a;
                while ((a = br.readLine()) != null) {
                    if ("注册成功".equals(a)){
                        return true;
                    }
                }
                br.close();
                //socket.close();

                return false;
            }
        }
    }
}
