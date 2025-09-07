package typeCasting;

/*
Chicken factory

*/

public class SolutionChickenFactory implements Continent {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //write your code here
            return hen;
        }
    }


}

