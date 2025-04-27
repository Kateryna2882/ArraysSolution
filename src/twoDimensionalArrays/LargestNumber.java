package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class LargestNumber {
    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }


        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);

        System.out.println("Maximum number: " + array[array.length - 1]);
        System.out.println("Maximum number: " + Collections.max(integers));
    }
}