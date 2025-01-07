import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayOfNumbersInReverseOrder {
    public static void main(String[] args) throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers in reverse order: ");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
