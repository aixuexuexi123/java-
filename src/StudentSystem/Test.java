package StudentSystem;

import StudentSystem.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void startTest()  {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------欢迎来到学生管理系统---------");
        loop:
        while (true) {
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> checkStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项,请重新输入");
            }
        }


    }

    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生地址");
        String address = sc.next();
        Student s = new Student(id, name, age, address);
        String uid = s.getId();
        boolean flag = contains(list, uid);
        if (flag) {
            System.out.println("输入id重复,添加失败");
        } else {
            list.add(s);
            System.out.println("添加成功");
        }

    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("该id不存在");
            return;
        } else {
            list.remove(index);
            System.out.println("删除成功");
        }

    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("该id不存在");
            return;
        } else {
            Student stu=list.get(index);
            System.out.println("请输入想要修改的学生姓名");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入想要修改的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入想要修改的学生地址");
            String newAddress = sc.next();
            stu.setAdress(newAddress);
            System.out.println("修改成功");
        }
    }
        //查询
        public static void checkStudent (ArrayList < Student > list) {
            System.out.println("查询学生");
            if (list.size() == 0) {
                System.out.println("没有添加学生,无法查询");
                return;
            }
            System.out.println("id    姓名   年龄   地址");
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAdress());
            }
        }

        //判断id是否存在
        public static boolean contains (ArrayList < Student > list, String id){
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                String uid = s.getId();
                if (id.equals(uid)) {
                    return true;
                }
            }
            return false;
        }

        //得到索引
        public static int getIndex (ArrayList < Student > list, String id){
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                String uid = s.getId();
                if (id.equals(uid)) {
                    return i;
                }
            }
            return -1;
        }
    }

