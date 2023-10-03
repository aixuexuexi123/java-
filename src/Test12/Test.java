package Test12;

public class Test {
    public static void main(String[] args) {
        Manager m=new Manager("001","张三",15000,8000);

        System.out.println(m.getId()+" "+m.getName()+" "+m.getSalary()+" "+m.getBonus());
        m.gongzuo();
        m.chifan();

        System.out.println("-----------------");
        Cooker c=new Cooker();
        c.setId("002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId()+" "+c.getName()+" "+c.getSalary());
        c.gongzuo();
        c.chifan();

    }

}
