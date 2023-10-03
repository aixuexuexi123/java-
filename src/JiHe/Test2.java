package JiHe;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        });
        ts.add("ab");
        ts.add("cba");
        ts.add("wqab");
        System.out.println(ts);
    }
}
