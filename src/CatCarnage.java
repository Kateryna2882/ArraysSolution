public class CatCarnage {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tim", 3, 5, 2);
        Cat cat2 = new Cat("Tom", 4, 6, 3);
        Cat cat3 = new Cat("Tum", 5, 4, 1);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        //write your code here
        String name = "Tim";
        int age;
        int weight;
        int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
        public boolean fight(Cat anotherCat) {

            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);
            int score = ageScore + weightScore + strengthScore;
            return score >0;
        }
    }

}
