package solutionarraylist;

import java.util.ArrayList;

public class SolutionArrayList {


    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }
    }
}

