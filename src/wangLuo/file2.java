package wangLuo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket socket = ss.accept();
        //把服务器数据写入本地文件
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\untitled2\\zhiLiao\\bd99b70291ac2159566a4a1fa8ed678b.jpg"));
        byte[]bytes=new byte[1024];
        int len ;
        while ((len=bis.read())!=-1){
            bos.write(bytes,0,len);
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();
        socket.close();
        ss.close();
    }
}
