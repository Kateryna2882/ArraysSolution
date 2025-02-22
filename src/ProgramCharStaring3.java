import java.util.Scanner;

public class ProgramCharStaring3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter path: "); //"home/user/documents/file.txt",
        String path = console.nextLine();
        String result = path.replace('/', '\\');

        System.out.println(result);
    }
}
