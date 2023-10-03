package Test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        char [] chs=new char[52];
        for (int i = 0; i < 52; i++) {
           if(i<=25){
               chs[i]=(char)(97+i);
           }else{
               chs[i]=(char)(97+i-26);
           }
        }
        Random r=new Random();
        String result="";
        for (int i = 0; i < 4; i++) {

            int RandomIndex= r.nextInt(52);
            result=result+chs[RandomIndex];
        }
      int number=r.nextInt(10);
           result=result+number;
        System.out.println(result);
    }
}
