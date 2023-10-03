package Test;

import java.util.Scanner;

public class TicketMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("输入一个数字 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            ticket=getPrice(ticket,seat,0.9,0.85);
        }
        else if((month >= 1 && month <= 40) || (month >= 11 && month <= 12)) if (seat == 0) {
            ticket=getPrice(ticket,seat,0.7,0.65);
        }
        else {
            System.out.println("输入月份不对");
        }
        System.out.println("现票价"+ticket);
    }
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

}