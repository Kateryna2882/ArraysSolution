package abstractclasses;

/*
Tom, Jerry and Spike

*/

public class Solution10 {

    public static void main(String[] args) {

    }
    public interface CanMove {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface CanEat {
        void eat();
    }

    class Cat implements CanMove, Edible, CanEat {

        public void eat() {

        }

        public void beEaten() {

        }

        public void move() {

        }
    }

    class Mouse implements CanMove, Edible {

        public void beEaten() {

        }

        public void move() {

        }
    }

    class Dog implements CanMove, CanEat {

        public void eat() {

        }

        public void move() {

        }
    }
}