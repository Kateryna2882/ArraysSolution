import java.util.Scanner;

public class ProgramCharString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a path:");
        String path = console.nextLine();

        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }

        String result = new String(chars);
        System.out.println("Updated path: " + result);

        console.close(); // Закриваємо Scanner, щоб уникнути витоків пам'яті
    }
}