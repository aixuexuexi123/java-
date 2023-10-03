package JiHe;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        ListUtil.addAll2(list,"bbb","ccc","ddd","aaa","aaa");
        System.out.println(list);
    }
}
