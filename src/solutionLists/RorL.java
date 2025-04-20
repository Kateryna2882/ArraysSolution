package solutionLists;

import java.util.ArrayList;

public class RorL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("rose");
        strings.add("love");
        strings.add("lyra");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //write your code here
        String r = "r";
        String l = "l";
        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) {
                continue;
            }
            if (!isR && isL) {
                result.add(string);
            }
        }
        return result;
    }

}
