package Test6;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class C = Class.forName("Test6.Car");

        Constructor []  declaredConstructor = C.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructor) {
            System.out.println(constructor);
        }


    }
}
