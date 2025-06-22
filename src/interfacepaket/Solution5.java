package interfacepaket;

/*
Human class and CanRun and CanSwim interfaces

*/

public class Solution5 {
    public static void main(String[] args) {

    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
