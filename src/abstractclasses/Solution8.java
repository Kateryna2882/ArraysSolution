package abstractclasses;
import java.awt.*;

/*
A fox is an animal

*/

public class Solution8 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }


    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
