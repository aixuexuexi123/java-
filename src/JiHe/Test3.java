package JiHe;

import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        Student s1=new Student("zangsan",21,99,98,96);
        Student s2=new Student("lisi",23,99,91,96);
        Student s3=new Student("wangwu",21,91,68,96);
        Student s4=new Student("qianqi",21,98,98,96);
        TreeSet<Student>ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);

    }
}
