package twoDimensionalArrays;

import java.util.ArrayList;

public class MoreSam {
    public static void main(String[] args) {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");
        list.add(1,"Ham");
        list.add(3,"Ham");
        list.add(5,"Ham");
        for (String string : list) {
            System.out.println(list);

        }
    }

}
