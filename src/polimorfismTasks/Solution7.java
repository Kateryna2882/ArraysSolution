package polimorfismTasks;

/*
Interfaces for the Human class

*/
public class Solution7 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);

    }

    public static interface Employee {
        public void workLazily();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazily();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman, Employee, Secretary{

        public void workHard() {
        }

        public void workLazily() {
        }
    }
}
