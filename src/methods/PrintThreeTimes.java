package methods;

public class PrintThreeTimes {

    public static void print3(String text) {
        //write your code here
        System.out.print(text);
        System.out.print(" ");
        System.out.print(text);
        System.out.print(" ");
        System.out.print(text);
        System.out.print(" ");

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }

}
