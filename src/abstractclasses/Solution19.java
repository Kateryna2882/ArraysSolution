package abstractclasses;

import java.awt.*;

/*
One method in a class

*/
public class Solution19 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static class Fox {
        public String getName() {
            return "Fox";
        }
    }
}

