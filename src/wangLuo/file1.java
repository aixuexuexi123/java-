package wangLuo;

import java.io.*;
import java.net.Socket;

public class file1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10000);
        //把本地数据写入服务器
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\untitled2\\zhiLiao\\bd99b70291ac2159566a4a1fa8ed678a.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[]bytes=new byte[1024];
        int len ;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();
        //接收回写
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);
        socket.close();
    }
}
