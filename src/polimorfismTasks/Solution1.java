package polimorfismTasks;

/*
We all have a little cat in us…

*/
public class Solution1 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "I'm Fluffy";
        }
    }

    public static class Cat extends Pet {
        public String getName() {
            return "I'm a cat";
        }
    }
}


