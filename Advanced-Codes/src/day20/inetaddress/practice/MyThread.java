package day20.inetaddress.practice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

    //获取锁
    private static final Lock lock = new ReentrantLock();

    private final Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        InputStreamReader isr = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //获得socket通道输入流
            is = socket.getInputStream();
            isr = new InputStreamReader(is);

            int len;
            char[] data = new char[1024];
            while ((len = isr.read(data)) != -1) {
                stringBuilder.append(new String(data, 0, len));
            }
            //2.userName=张三&password=123456
            //index=2
            String index = stringBuilder.toString().split("\\.")[0];
            //user = userName=张三&password=123456
            String user = stringBuilder.toString().split("\\.")[1];
            //userName=张三&password=123456
            String userName = user.split("&")[0].split("=")[1];
            String password = user.split("&")[1].split("=")[1];
            String userdata = userName + "=" + password;
            //System.out.println(index);
            //System.out.println(index+userName+password);
            if ("1".equals(index)) {
                BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day20\\inetaddress\\practice\\User.txt"));

                String str;
                while ((str = br.readLine()) != null) {
                    if (userdata.equals(str)) {
                        System.out.println("登录");
                    } else {
                        System.out.println("失败");
                    }
                }

                OutputStream os = socket.getOutputStream();
                os.write("已接收".getBytes());
                os.close();
            }
            //注册
            if ("2".equals(index)) {

                BufferedReader br = new BufferedReader(new FileReader("Advanced-Codes\\src\\day20\\inetaddress\\practice\\User.txt"));

                String str;
                while ((str = br.readLine()) != null) {
                    //张三=123456
                    str = str.split("=")[0];
                    if (userName.equals(str)) {
                        System.out.println("该用户已存在");

                        OutputStream os = socket.getOutputStream();
                        os.write("注册失败".getBytes());
                        os.close();
                    } else {
                        //锁:防止多线程同时写入导致数据错误
                        try {
                            lock.lock();
                            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Advanced-Codes\\src\\day20\\inetaddress\\practice\\User.txt", true));
                            BufferedWriter bw = new BufferedWriter(osw);
                            bw.write(userdata);
                            bw.newLine();
                            bw.flush();
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            lock.unlock();
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("注册成功".getBytes());
                        os.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (isr != null) {
                    isr.close();
                }
                if (is != null) {
                    is.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
