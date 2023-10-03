package wangLuo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class tcp4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        //监听连接
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }
        OutputStream os = socket.getOutputStream();
        os.write("见到你很高兴".getBytes(StandardCharsets.UTF_8));
        socket.close();
        ss.close();
    }
}
