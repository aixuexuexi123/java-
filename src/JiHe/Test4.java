package JiHe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test4 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("胡桃","火墙");
        map.put("甘雨","冰c");
        map.put("将军","拔刀");
        /*Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }*/
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
