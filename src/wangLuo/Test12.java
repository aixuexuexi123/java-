package wangLuo;

public class Test12 {
    public static void main(String[] args) {
        int y;
        for (int i = 0; i < 10000000; i++) {
            y=i;
            if((y*y)%13==7||(y*y)%13==6 ){
                System.out.println("True");
                System.out.println(y);
                System.out.println();
                break;
            }

        }

    }
}
