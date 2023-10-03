package IO;

import java.io.*;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) throws IOException {
    Student s1=new Student("zangsan",18,"wuhan");
    Student s2=new Student("lisi",20,"wuhan");
    Student s3=new Student("wangwu",19,"wuhan");
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("zhiLiao//b.text"));
        oos.writeObject(list);
        oos.close();
    }
}
