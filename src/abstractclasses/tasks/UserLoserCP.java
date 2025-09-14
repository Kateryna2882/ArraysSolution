package abstractclasses.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
User, loser, coder and programmer

*/
public class UserLoserCP {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // Here's the loop for reading the keys. Item 1
        {
            // Create an object. Item 2

            doWork(person); // Call doWork

        }
    }

    public static void doWork(Person person) {
        // Item 3
    }
}
