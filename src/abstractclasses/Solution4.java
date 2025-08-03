package abstractclasses;

/*
Cows are animals too

*/

public class Solution4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "";
        }
    }

}