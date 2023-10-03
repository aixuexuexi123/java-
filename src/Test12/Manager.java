package Test12;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void gongzuo(){
        System.out.println("经理在管理员工");
    }
}
