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
}
