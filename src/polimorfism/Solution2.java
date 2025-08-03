package polimorfism;

/*
Whales, the descendants of cows

*/
public class Solution2 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "";
        }
    }
}
