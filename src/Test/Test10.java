package Test;

import java.util.Scanner;

public class Test10 {
    //Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9
    //长度不超过9
    //只能是数字
    public static void main(String[] args) {
        //键盘录入
        Scanner sc=new Scanner(System.in);
        String str;
        //判断符合不符合
        while (true){
            System.out.println("输入一串数字");
            str=sc.next();
            boolean flag=checkStr(str);
            if(flag){
                 break;
            }else{
                System.out.println("请重新输入");
                continue;
            }
        }
       StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number=c-48;
             String s= changeStr(number);
              sb.append(s);
        }
        System.out.println(sb);

    }

    public static boolean checkStr(String str){
        int len = str.length();
        if(len>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c<'0'&&c>'9'){
                return false;
            }
        }

        return true;
        }


    //转化为罗马字母
    public static String changeStr(int number){
        String[] strLuoma={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return  strLuoma[number];

    }
}
