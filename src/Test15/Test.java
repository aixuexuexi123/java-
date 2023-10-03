package Test15;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("shutdown -a");
       //Runtime.getRuntime().exec("shutdown -s -t 600");
    }
}
