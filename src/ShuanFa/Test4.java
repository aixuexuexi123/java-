package ShuanFa;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(grtSum(20));

    }
    public static int grtSum(int floor){
       if(floor==1){
           return 1;
       }else if(floor==2){
           return 2;
       }else if(floor<1){
           System.out.println("输入台阶有误");
       }else if(floor==3){
           return 4;
       }
           return grtSum(floor-1)+grtSum(floor-2)+grtSum(floor-3);

    }
}
