package JiHe;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        Collections.addAll(list,"胡桃","甘雨","将军","凌华","宵宫","心海","纳西妲");
        int count = list.size();
        for (int i = 1; i < 5; i++) {
            System.out.println("---------第"+i+"周选秀开始了--------------");
            for (int j = 0; j < count; j++) {
                Collections.shuffle(list);
                String laopo = list.get(0);
                System.out.println(laopo);
                list.remove(laopo);
                list2.add(laopo);
            }
            list.addAll(list2);
            list2.clear();
        }
    }
}
