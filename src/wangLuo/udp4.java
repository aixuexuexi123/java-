package wangLuo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp4 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);
        byte[]bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        while (true) {
            //接受 解包
            ds.receive(dp);

            //
            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            System.out.println("接受的数据为:"+new String(data,0,len));
            System.out.println("该数据从"+address+" "+port+"的端口发送");
        }

    }
}
