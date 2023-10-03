package Test;

public class Test11 {

    public static void main(String[] args) {
        //旋转比较
        String str1="abcde";
        String str2="deab";

        boolean flag=checkStr(str1,str2);
        if(flag){
            System.out.println("str1不可以旋转得到str2");


        }
        else{
            System.out.println("str1不可以旋转得到str2");


            
        }

    }
    //旋转

    public static String rotate(String str1){
        char first = str1.charAt(0);
        String end=str1.substring(1);
        return end+first;

    }
    public static boolean checkStr(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            if(str1.equals(str2)){
                return true;

            }
        }
        return false;


    }
}
