package abstractclasses;

/*
"Fix the code", part 1

*/
public class Solution2 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I'm a kitten";
        }

        public abstract Pet getChild();
    }

}
