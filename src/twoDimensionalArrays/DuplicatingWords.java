package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static solutionarraylist.SolutionArrayList.list;

public class DuplicatingWords {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        ArrayList<String> result = doubleValues(list);
        for (String string : result) {
            System.out.println(string);
            // Display result
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> result = new ArrayList<>();
        for (String string : list){
            result.add(string);
            result.add(string);
        }
        return result;
    }

}
