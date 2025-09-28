package typeCasting;

/*
Chicken factory

*/

public class SolutionChickenFactory implements Continent {
    public static void main(String[] args) {
        Hen hen = Hen.HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();

    }

    public abstract class Hen {
        abstract int getMonthlyEggCount();

        String getDescription() {
            return "I am a chicken.";
        }

        static class HenFactory {
            public static Hen getHen(String africa) {
                return null;
            }


            String getDescription() {
                return "I am a chicken.";
            }

            public class NorthAmericanHen extends Hen {
                @Override
                int getMonthlyEggCount() {
                    return 0;
                }

                @Override
                String getDescription() {

                    return "I am a chicken.";
                }
            }

            public class EuropeanHen extends Hen {
                @Override
                String getDescription() {
                    return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.EUROPE, getMonthlyEggCount());
                }

                @Override
                int getMonthlyEggCount() {
                    return 10;
                }

                public class AsianHen extends Hen {

                }

                public class AfricanHen extends Hen {
                    @Override
                    String getDescription() {
                        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.",
                                Continent.AFRICA,
                                getMonthlyEggCount());
                    }

                    @Override
                    int getMonthlyEggCount() {
                        return 11;
                    }

                    static Hen getHen(String continent) {
                        Hen hen = null;

                        switch (continent) {
                            case Continent.AFRICA:
                                hen = new AfricanHen();
                                break;
                            case Continent.NORTHAMERICA:
                                hen = new NorthAmericanHen();
                                break;
                            case Continent.EUROPE:
                                hen = new EuropeanHen();
                                break;
                            case Continent.ASIA:
                                hen = new AsianHen();
                                break;
                        }
                        return hen;
                    }
                }

            }
        }

    }
}