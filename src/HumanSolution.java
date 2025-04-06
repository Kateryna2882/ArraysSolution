public class HumanSolution { public static void main(String[] args) {
}

    public static class Human {
        // Write your variables and constructors here
        String name;
        int age;
        char sex;
        boolean woman;
        double weigh;
        long phone;

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, char sex, boolean woman, double weigh, long phone) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.woman = woman;
            this.weigh = weigh;
            this.phone = phone;
        }

        public Human(long phone) {
            this.phone = phone;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }



        public Human(double weigh) {
            this.weigh = weigh;
        }

        public Human(boolean woman) {
            this.woman = woman;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
    }

}
