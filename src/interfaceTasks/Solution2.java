package interfaceTasks;
/*
Beer. Part 2. The recovery.

*/

public class Solution2 {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Alcoholic beverage";
            } else {
                return "Non-alcoholic beverage";
            }

        }

    }
}