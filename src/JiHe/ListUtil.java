package JiHe;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}
    public static<T> void addAll (ArrayList<T>list,T t1,T t2,T t3,T t4,T t5){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
    }
    public static<T> void addAll2(ArrayList<T>list,T...t){
        for (T t1 : t) {
           list.add(t1) ;
        }

    }
}
