package Test9;

import java.util.Scanner;

public class Money {
    //遍历,反转
    //数字转换
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money;
        while (true){
            System.out.println("请录入一个金额");
             money=sc.nextInt();
            if(money>=0&&money<=999999){
              break;
            }else{
                System.out.println("请重新输入金额");
            }
        }
        //得到各个数字
        int ge;
        //大写
        String numberStr="";
        while(true){
            ge=money%10;
            if(money==0){
                break;
            }
            money=money/10;
            String CapitalNumber = getCapitalNumber(ge);
            //拼接大写
            numberStr=CapitalNumber+numberStr;
        }
        int count=7-numberStr.length();
        //加零
        for (int i = 0; i < count; i++) {
            numberStr= "零"+numberStr;
            //拼接最终结果
        }
        String moneyStr="";
        for (int i = 0; i < numberStr.length(); i++) {
            String []arr2={"佰","拾","万","千","佰","拾","元",};
            char c=numberStr.charAt(i);
            moneyStr=moneyStr+c+arr2[i];
        }
        System.out.println(moneyStr);
        }
        //反转


    public static String getCapitalNumber(int ge){
        String []arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[ge];
    }
}
