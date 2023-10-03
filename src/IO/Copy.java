package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("untitled2\\image\\girl\\girl10\\all.jpg");
        FileOutputStream fos=new FileOutputStream("zhiLiao\\meinv.jpg");

       /* int len;
        byte[]bytes=new byte[1024*1024*5];
        while ((len= fis.read(bytes)) !=-1) {
            fos.write(bytes, 0, len);
        }*/

        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }


        fos.close();
        fis.close();
    }
}
