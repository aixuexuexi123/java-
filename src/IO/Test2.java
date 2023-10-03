package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("zhiLiao\\a.text");
        //读取数据
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char) b);
        }
        //释放
    }
}
