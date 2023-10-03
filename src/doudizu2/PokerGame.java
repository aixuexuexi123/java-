package doudizu2;

import java.util.*;
import java.util.function.BiConsumer;

public class PokerGame {
    //双列
   static HashMap<Integer,String>hm=new HashMap<>();
   static ArrayList<Integer>list=new ArrayList<>();
    static {
        int serialnumber=1;
        list.add(serialnumber);
        //准备牌
        String[]color={"♥","♦","♣","♠"};
        String[]number={"3","4","5","6" ,"7", "8", "9", "10" ,"J", "Q", "K", "A", "2"};
        for (String n : number) {
            for (String c : color) {
                  hm.put(serialnumber,c+n);
                  serialnumber++;
                list.add(serialnumber);
            }
        }
        hm.put(serialnumber,"大王");
        serialnumber++;
        list.add(serialnumber);
        hm.put(serialnumber,"小王");
    }
    PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
       TreeSet<Integer> lord=new TreeSet<>();
       TreeSet<Integer> player1=new TreeSet<>();
       TreeSet<Integer> player2=new TreeSet<>();
       TreeSet<Integer> player3=new TreeSet<>();
        //遍历集合,把牌发给三位玩家
        for (int i = 0; i < list.size(); i++) {
            int poker = list.get(i);
            if(i<=2){
                 lord.add(poker);
                continue;
            }
            if(i%3==0){
                player1.add(poker);
            }else if (i%3==1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("小哥哥",player1);
        lookPoker("小姐姐",player2);
        lookPoker("丑八怪",player3);

    }
   public void lookPoker(String name, TreeSet<Integer>ts){
       System.out.print(name+" :");
       for (Integer key : ts) {
           String value = hm.get(key);
           System.out.print(value+" ");
       }
       System.out.println();
          
   }

}
