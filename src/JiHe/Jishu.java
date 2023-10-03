package JiHe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.function.BiConsumer;

public class Jishu {
    public static void main(String[] args) {
        String[]arr={"A","B","C","D",};
        ArrayList<String>list=new ArrayList<>();
        Random r=new Random();
        //随机得到80个投票
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            String s = arr[index];
            list.add(s);
        }
        //把景点和对应投票放入
        HashMap<String,Integer>hs=new HashMap<>();
        for (String name : list) {
            if(hs.containsKey(name)){
                Integer count = hs.get(name);
                count++;
                hs.put(name,count);
            }else {
                hs.put(name,1);
            }
        }
        //遍历
        hs.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String name, Integer count) {
                System.out.println(name+"="+count);
            }
        });
    }
}
