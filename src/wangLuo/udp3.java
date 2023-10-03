package wangLuo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class udp3 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        //打包
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你想说的话:");
            String str = sc.next();
            if (str.equals("10086")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port=10086;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);

        }
        ds.close();

    }
}
