package polimorfismTasks;
/*
Climb, fly, and run

*/

public class Solution5 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanClimb {
        public void climb();
    }

    public interface CanRun {
        public void run();
    }

    public class Cat implements CanRun, CanClimb {
        public void climb() {
        }

        public void run() {
        }
    }

    public class Dog implements CanRun {
        public void run() {
        }
    }

    public class Tiger extends Cat {
        public void run() {
        }

        public void climb() {
        }
    }

    public class Duck implements CanRun, CanFly {
        public void run() {
        }

        public void fly() {
        }
    }
}
