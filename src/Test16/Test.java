package Test16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入女朋友姓名");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入女朋友年龄");
                String agestr = sc.nextLine();
                int age = Integer.parseInt(agestr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (nameFormatException e) {
                e.printStackTrace();
            } catch (ageOutBundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(gf);

    }
}