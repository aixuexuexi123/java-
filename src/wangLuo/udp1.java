package wangLuo;

import java.io.IOException;
import java.net.*;

public class udp1 {
    public static void main(String[] args) throws IOException {
        //快递 打包 发送
        DatagramSocket ds=new DatagramSocket();
         //打包
        String str="你好啊!!!";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10086;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);
        ds.close();
    }
}
