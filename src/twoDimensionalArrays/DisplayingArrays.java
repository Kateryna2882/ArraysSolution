package twoDimensionalArrays;

import java.util.Arrays;

public class DisplayingArrays {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String Strstrings = Arrays.toString(strings);
        String Strints = Arrays.toString(ints);
        System.out.println(Strstrings);
        System.out.println(Strints);

    }
}
