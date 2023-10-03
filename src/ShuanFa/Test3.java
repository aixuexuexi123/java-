package ShuanFa;

public class Test3 {
    public static void main(String[] args) {
        //1
        //
        System.out.println(getSum(1));
    }
    public static int getSum(int day){
        if(day==10){
          return 1;
        }
        return (getSum(day+1)+1)*2;
    }
}
