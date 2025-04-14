package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MinimumMaximum {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //write your code here
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            strings.add(reader.readLine());
        }
        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }


        System.out.println("Min string: " + Collections.min(strings));
        System.out.println("Max string: " + Collections.max(strings));
        }
    }


