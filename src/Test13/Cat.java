package Test13;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"色的猫在吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
