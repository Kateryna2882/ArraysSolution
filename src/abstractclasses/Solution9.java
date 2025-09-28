package abstractclasses;

import java.awt.*;

/*
A big fox is still a fox

*/

public class Solution9 {
    public static void main(String[] args) throws Exception {
        BigFox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        public Color getColor() {
            return Color.GRAY;
        }
    }
}
