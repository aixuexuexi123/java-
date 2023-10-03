package JiHe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Collection <String>coll= new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //迭代器
        /*Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);*/
        //增强for
        /*for (String s : coll) {
            System.out.println(s);
        }*/
        coll.forEach( s-> {System.out.println(s);
            }
        );
        }
    }


