package IO;

import java.io.*;
import java.nio.Buffer;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedReader br=new BufferedReader(new FileReader("zhiLiao\\count.text"));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;
        if(count<=3){
            System.out.println("这是第"+count+"次使用软件,可以免费使用");
        }else {
            System.out.println("三次免费机会使用已用完,请注册充值");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("zhiLiao\\count.text"));
        bw.write(count+"");
        bw.close();

    }
}
