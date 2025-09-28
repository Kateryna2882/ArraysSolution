package abstractclasses;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Sorting even numbers from a file

*/
public class Solution21 {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        Scanner scanner = new Scanner(fileInputStream);
        List<Integer>data = new ArrayList<>();
        while (scanner.hasNext()){
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }
        Collections.sort(data);
        for (Integer value : data){
            System.out.println(value);

            scanner.close();
            fileInputStream.close();
        }
    }
}

