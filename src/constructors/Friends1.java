package constructors;

public class Friends1 {

    //write your code here
    public String name;
    public int age;
    public char sex;

    public Friends1(String name) {
        this.name = name;
    }

    public Friends1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friends1(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static void main(String[] args) {

    }

}
