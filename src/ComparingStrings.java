import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter path: ");
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("This is a jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("This is an HTML page");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("This is a Word document");
        } else {
            System.out.println("Unknown format");
        }
    }
}