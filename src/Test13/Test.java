package Test13;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("老王",18);
        Dog d=new Dog(3,"黑");
        p.keepPet(d,"骨头");

        Person p2=new Person("老李",22);
        Cat c=new Cat(4,"黑");
        p2.keepPet(c,"馍");
    }
}
