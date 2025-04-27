import java.util.Scanner;

public class LowerCase {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
