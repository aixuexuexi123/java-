package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身份证号");
        String personId = sc.next();
        boolean flag = checkpersonId(personId);
        System.out.println(flag);
    }

    private static boolean checkpersonId(String personId) {
        //1. 18位
        if(personId.length()!=18){
            return false;
        }
        //2. 不能以0开头
        if(personId.startsWith("0")){
            return false;
        }
        //3. 前17位为数字
        for (int i = 0; i < personId.length()-1; i++) {
            char c = personId.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        //4. 最后以为是x,X,数字
        /*char endChar = personId.charAt(personId.length() - 1);
        if(!((endChar>'0'&&endChar<'9')||endChar=='x'||endChar=='X')){
            return false;
        } */
        return true;
    }
}
