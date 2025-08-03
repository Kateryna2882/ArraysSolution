package interfaceTasks;

/*
Who's that smarty?

*/

public class Solution10 {
    public static void main(String[] args) {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary {
    }

    interface Boss {
    }

    class Manager {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
