import java.util.Scanner;

public class ProgramCharString2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter path: ");
        String path = console.nextLine();
        String array[] = path.split("\\/");
        String result= String.join("\\", array);
        System.out.println(result);
    }
}
