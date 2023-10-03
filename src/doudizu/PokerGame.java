package doudizu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    static ArrayList<String>list=new ArrayList<>();
    //"♥","♦","♣","♠"
    //"3","4" "5","6" ,"7", "8", "9", "10" ,"J", "Q", "K", "A", "2"
    static {
        String[]color={"♥","♦","♣","♠"};
        String[]number={"3","4","5","6" ,"7", "8", "9", "10" ,"J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String num : number) {
                list.add(c+num);
            }
        }
        list.add("大王");
        list.add("小王");
    }
    PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String>lord=new ArrayList<>();
        ArrayList<String>player1=new ArrayList<>();
        ArrayList<String>player2=new ArrayList<>();
        ArrayList<String>player3=new ArrayList<>();
        //遍历集合,把牌发给三位玩家
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
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
        look("底牌",lord);
        look("小哥哥",player1);
        look("小姐姐",player2);
        look("丑八怪",player3);
    }
    public void look(String name,ArrayList<String>list){
        System.out.print(name+" :");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
