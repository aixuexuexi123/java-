package StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1:登录 2:注册 3:忘记密码 4:退出");
            String choose = sc.next();
            switch (choose){
                case "1"-> Longin( list);
                case "2"-> Register( list);
                case "3"-> ForgetPassword( list);
                case "4"->{
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项,请重新输入");
            }
        }
    }


     //用户注册
    private static void Register(ArrayList<User> list) {
        Scanner sc=new Scanner(System.in);
        String username;
        String password;
        String personId;
        String phoneNumber;
        //1.用户名输入
        while (true) {
            System.out.println("注册");
            System.out.println("请输入用户名");
             username = sc.next();
            boolean flag1 = checkUsername(username);
            if(!flag1){
                System.out.println("输入格式不正确,请重新输入");
                continue;
            }
            boolean flag2= contains(list,username);
            if(flag2){
                System.out.println("输入的用户名"+username+"已存在,请重新输入");
            } else {
                System.out.println("输入的用户名"+username+"可以使用");
                break;
            }
        }
        //2.密码设置
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if(!password.equals(againPassword)){
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            }else {
                System.out.println("密码设置成功");
                break;
            }
        }
        //3.身份证号输入
        while (true) {
            System.out.println("请输入身份证号码");
             personId = sc.next();
            boolean flag=  checkpersonId(personId);
            if(!flag){
                System.out.println("输入身份证号格式不正确,请重新输入");
                continue;
            }else {
                System.out.println("身份证号输入成功");
                break;
            }
        }
        //4.手机号输入
        while (true) {
            System.out.println("请输入手机号码");
             phoneNumber = sc.next();
            boolean flag =checkphoneNumber(phoneNumber);
            if(flag){
                System.out.println("手机号输入成功");
                break;
            }else {
                System.out.println("手机号格式不正确,请重新输入");
                continue;
            }
        }

        //创造用户对象,并添加到集合
        User u=new User(username,password,personId,phoneNumber);
        list.add(u);
        System.out.println("注册成功");
        printList(list);

    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getPersonId()+user.getPhoneNumber());
        }
    }

    private static boolean checkphoneNumber(String phoneNumber) {
        //1. 11位
        if(phoneNumber.length()!=11){
            return false;
        }
        //2.不能以0开头
        if(phoneNumber.startsWith("0")){
            return false;
        }
        //3.只能是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkpersonId(String personId) {
        //1. 18位
        if(personId.length()!=18){
            return false;
        }
        //2. 不能以0开头
        if(personId.startsWith("0")){
            return false;
        }
        //3. 前17位为数字
        for (int i = 0; i < personId.length()-1; i++) {
            char c = personId.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        //4. 最后以为是x,X,数字
        char endChar = personId.charAt(personId.length() - 1);
        if(!((endChar>'0'&&endChar<'9')||endChar=='x'||endChar=='X')){
            return false;
        }
        return true;
    }

    //唯一性判断
    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if(rightUsername.equals(username)){
                return true;
            }
        }
        return false;
    }

    //检验用户名是否符合
    private static boolean checkUsername(String username) {
        int len = username.length();
        //检验长度
        if (len < 3 || len > 15) {
            return false;
        }
        //检验只能是字母和数字组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c >= '0' && c <= '9')) {
                return false;
            }
        }
        //检验不能全为数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count>0;
    }

        private static void Longin (ArrayList < User > list) {
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入用户名");
                String username = sc.next();
                boolean flag = contains(list, username);
                if(!flag){
                    System.out.println("该用户未注册,请先注册");
                    return;
                }
                System.out.println("请输入用户密码");
                String password = sc.next();

                while (true) {
                    String rightCode = getCode();
                    System.out.println(rightCode);
                    System.out.println("请输入验证码");
                    String code = sc.next();
                    if(rightCode.equalsIgnoreCase(code)){
                        System.out.println("验证码正确");
                        break;
                    }else {
                        System.out.println("验证码不一致,请重新输入");
                        continue;
                    }
                }
                //检验用户名和密码
                User user=new User(username,password,null,null);
                boolean flag4=checkUserInfor(list,user);
                if(flag4){
                    System.out.println("登录成功,可以使用学生管理系统");
                    Test t=new Test();
                    t.startTest();
                    break;
                }else {
                    System.out.println("登陆失败,用户名或密码有误");
                    if(i==2){
                        System.out.println("该用户"+username+"被锁定,请联系管理员解除锁定");
                        return;
                    }else {
                        System.out.println("登陆失败,用户名或密码有误,还剩"+(2-i)+"次机会");
                    }
                }
            }
        }

    private static boolean checkUserInfor(ArrayList<User> list, User user) {
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(user.getUsername().equals(u.getUsername())&&user.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }

    private static void ForgetPassword (ArrayList < User > list) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String uername = sc.next();
            boolean flag = contains(list, uername);
            if(!flag){
                System.out.println("该用户不存在");
                return;
            }
            //录入身份证号和手机号并检验
        System.out.println("请输入身份证号");
        String personId = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
     int index=  findIndex(list,uername);
        User user = list.get(index);
        if(!(user.getPersonId().equalsIgnoreCase(personId))&&(user.getPhoneNumber().equalsIgnoreCase(phoneNumber))){
            return;
        }
        String password;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if(!password.equals(againPassword)){
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            }else {
                System.out.println("两次密码输入一致");
                break;
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    private static int findIndex(ArrayList<User> list, String uername) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String  name = user.getUsername();
            if(uername.equals(name)){
                return i;
            }

        }
        return  -1;

    }


    //得到验证码
        private static String getCode(){
        //4字母 1数字
            ArrayList<Character> list=new ArrayList<>();
            StringBuilder sb=new StringBuilder();
            Random r=new Random();
        //创建集合,添加大小字母
            for (int i = 0; i < 26; i++) {
                list.add((char)('a'+i));
                list.add((char)('A'+i));
            }
        //随机抽4次
            for (int i = 0; i < 4; i++) {
                int index = r.nextInt(list.size());
                sb.append(list.get(index));
            }
            int number = r.nextInt(10);
            sb.append(number);
            //打乱顺序
            char[] arr = sb.toString().toCharArray();
            int randomIndex = r.nextInt(arr.length);
            char temp=arr[randomIndex];
            arr[randomIndex]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            return new String(arr);
        }

    }
