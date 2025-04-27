package solutionarraylist;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TopList {

    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = bufferedReader.readLine();
            strings.add(0, string);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}

