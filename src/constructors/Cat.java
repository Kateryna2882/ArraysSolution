package constructors;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String color;
    public String address;

    public Cat(String name) {
        this.name = name;
        age = 1;
        weight = 1;
        color = "unknown";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 1;
        color = "unknown";

    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "unknown";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = "unknown";
        age = 0;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
