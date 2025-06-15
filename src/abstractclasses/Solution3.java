package abstractclasses;

/*
"Fix the code", part 2

*/
public class Solution3 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I'm a kitten";
        }

        public abstract Pet getChild();
    }

}