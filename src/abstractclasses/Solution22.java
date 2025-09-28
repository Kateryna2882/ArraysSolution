package abstractclasses;

import java.util.ArrayList;
import java.util.List;

/*
Turnip

*/

public class Solution22 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Turnip"));
        plot.add(new Person("Grandpa"));
        plot.add(new Person("Grandma"));
        plot.add(new Person("Granddaughter"));
        TurnipStory.tell(plot);
    }

    public static class Person implements TurnipItem {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public void pull(Person second) {
            System.out.println(name + " behind " + second.getName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public interface TurnipItem {
        public String getName();
    }

    public class TurnipStory {
        static void tell(List<Person> items) {
            Person first;
            Person second;
            for (int i = items.size() - 1; i > 0; i--) {
                first = items.get(i - 1);
                second = items.get(i);
                second.pull(first);
            }
        }
    }

}
