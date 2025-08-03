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

    interface Secretary extends Person {
        @Override
        void startToWork();
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
