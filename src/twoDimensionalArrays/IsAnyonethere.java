package twoDimensionalArrays;

import java.util.Arrays;

public class IsAnyonethere {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
//        Arrays.sort(array);
//        if(element == 5){
//        int index = Arrays.binarySearch(array, element);
//        System.out.println(index);
//    } else {
//            System.out.println(false);
//        }

        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, element);
        System.out.println(index >= 0);
    }
}
