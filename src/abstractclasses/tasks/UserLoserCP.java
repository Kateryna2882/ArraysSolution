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
        String key;

        // Here's the loop for reading the keys. Item 1
        while (true)
        {
            key = reader.readLine();
            boolean u = key.equals("user")|| key.equals("loser")||key.equals("coder")||key.equals("programer");
            if(!u) break;
            // Create an object. Item 2
            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    break;
            }
            doWork(person); // Call doWork

        }
    }

    public static void doWork(Person person) {
        // Item 3
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        } else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();
        } else if (person instanceof Person.Programmer) {
            Person.Programmer programmer = (Person.Programmer) person;
            programmer.enjoy();
        }
    }
}
