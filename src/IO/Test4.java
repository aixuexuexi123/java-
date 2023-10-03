package IO;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("zhiLiao//a.text")));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
