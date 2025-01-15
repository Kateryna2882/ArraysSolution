import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreetAndHouses {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] countResidents = new int[15];
        for (int i = 0; i < countResidents.length; i++) {
            countResidents[i] = Integer.parseInt(reader.readLine());
            }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < countResidents.length; i++) {
            if (i % 2 == 0) {
                even += countResidents[i];
            } else {
                odd += countResidents[i];
            }
        }

        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
