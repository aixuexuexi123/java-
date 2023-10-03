package Test13;

public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void keepPet(Animal animal,String something) {
        if(animal instanceof Dog dog){
            System.out.println(getAge()+"岁的"+getName()+"在饲养"+dog.getAge()+"岁的"+dog.getColor()+"色的狗");
            dog.eat(something);
        }else if(animal instanceof Cat cat){
            System.out.println(getAge() + "岁的" + getName() + "在饲养" + cat.getAge() + "岁的" + cat.getColor() + "色的猫");
            cat.eat(something);
        }else {
            System.out.println("没有这个类型");
        }

    }

}
