package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("zhiLiao\\d.text");
        //读取数据
        String str = "rangwoouyici";

        //释放
        fos.close();
    }
}
