package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Test7 {
    public static void main(String[] args) throws FileNotFoundException {
        /*PrintStream ps=new PrintStream(new FileOutputStream("zhiLiao//c.text"));
        ps.println("大师你");
        ps.print(66);
        ps.close();*/
        PrintWriter pw=new PrintWriter(new FileOutputStream("zhiLiao//e.text"));
        pw.println("henhen");
        pw.println("嘿嘿");
        pw.close();
    }
}
