package solutionLists;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordsInReverse {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter sting " + (i + 1) + ": " );
            String string = reader.readLine();
            list.add(string);
//            list.add(reader.readLine());
        }


        list.remove(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            String string = list.get(i);
            System.out.println(string);
        }
    }
}


