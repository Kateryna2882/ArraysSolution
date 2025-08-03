package polimorfism;
/*
Whether it's a bird or a lamp

*/
public class Solution4 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat)
            System.out.println("Cat");

        if (o instanceof Dog)
            System.out.println("Dog");

        if (o instanceof Bird)
            System.out.println("Bird");

        if (o instanceof Lamp)
            System.out.println("Lamp");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}