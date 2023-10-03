package Test;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);

    }
    private static String getCode(){
        //4字母 1数字
        ArrayList<Character> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Random r=new Random();
        //创建集合,添加大小字母
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        //随机抽4次
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            sb.append(list.get(index));
        }
        int number = r.nextInt(10);
        sb.append(number);
        //打乱顺序
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp=arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return new String(arr);
    }

}
