package solutionLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static solutionarraylist.SolutionArrayList.list;

public class ThreeArrays {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        for (int i = 0; i < 20; i++) {
            int number = numbers.get(i);

            if (number % 3 == 0 || number % 2 == 0) {
                if (number % 3 == 0) {
                    divBy3.add(number);
                }
                if (number % 2 == 0) {
                    divBy2.add(number);
                }
            } else {
                others.add(number);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //write your code here
        for (Integer number : list) {
            System.out.println(number);
        }

    }
}

