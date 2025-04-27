package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveInsert {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string: " + (i + 1) + ": ");
            strings.add(reader.readLine());
        }


        for (int i = 0; i < 13; i++) {
            String last = strings.remove(strings.size() - 1);
            strings.add(0, last);
        }

        for (String str : strings) {
            System.out.println(str);
        }
    }
}

