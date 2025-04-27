package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SolutionL13L2 {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            strings.add(bufferedReader.readLine());
        }
        int min = strings.get(0).length();
        for (String string : strings) {
            if (string.length() == min){
                System.out.println(string);
                System.out.println("Min string: " + Collections.min(strings));
            }
        }

    }
}


