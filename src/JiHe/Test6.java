package JiHe;

import java.security.Key;
import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();
        Collections.addAll(list1,"行秋","香菱","点赞哥","将军");

        ArrayList<String>list2=new ArrayList<>();
        Collections.addAll(list2,"心海","申鹤","凌华","万叶");

        ArrayList<String>list3=new ArrayList<>();
        Collections.addAll(list3,"钟离","将军","纳西妲","温迪");
         Collections.shuffle(list1);
         Collections.shuffle(list2);
         Collections.shuffle(list3);
        HashMap<String,ArrayList<String>>hm=new HashMap<>();
        hm.put("雷国",list1);
        hm.put("永冻",list2);
        hm.put("四神",list3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj=new StringJoiner(",","","");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key+"="+sj);
        }


    }
}
