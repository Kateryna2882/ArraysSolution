package abstractclasses;

/*
Wine tasting

*/

public class WineTasting {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getSparklingWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static SparklingWine getSparklingWine() {
        return new SparklingWine();
    }
}
