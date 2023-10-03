package wangLuo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class tcp1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
       os.write("你好你好".getBytes(StandardCharsets.UTF_8));
        os.close();
        socket.close();
    }
}
