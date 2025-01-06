import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = new String[10];
        for (int i = 0; i < 8; i++) {
            arrays[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arrays[i]);
        }
    }
}