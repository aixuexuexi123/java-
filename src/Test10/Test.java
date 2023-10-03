package Test10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();
        Phone p1=new Phone("小米",3500);
        Phone p2=new Phone("华为",2600);
        Phone p3=new Phone("锤子",2900);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> printlist=contains(list);
        for (int i = 0; i < printlist.size(); i++) {
            Phone phone=printlist.get(i);
            System.out.println(phone.getBrand()+" "+phone.getPrice());
        }
    }
    public static ArrayList<Phone> contains(ArrayList<Phone> list){
        ArrayList<Phone> resultlist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p=list.get(i);
            int price=p.getPrice();
            if(price<3000){
                resultlist.add(p);
            }
        }
       return resultlist;
    }
}
