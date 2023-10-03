package ShuanFa;

import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1=new GirlFriend("xiaoshishi",18,165);
        GirlFriend gf2=new GirlFriend("xiaohuihui",18,169);
        GirlFriend gf3=new GirlFriend("xiaoqingqing",19,175);
        GirlFriend[]arr={gf1,gf2,gf3};
        //按照年龄,身高,姓氏排序
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
               temp=temp==0?o1.getHeight()-o2.getHeight():temp;
               temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp>0){
                  return 1;
                }else if(temp<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
