package Test12;

public class Cooker extends Employee {
    public Cooker() {
    }

    public Cooker(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void gongzuo(){
        System.out.println("厨师在做饭");
    }
}
