package bank;


enum Currency {
    USD(1.0),
    EUR(1.1),
    GBP(1.3),
    JPY(0.009);
    private final double exchangeRateToUSD;

    Currency(double exchangeRateToUSD) {
        this.exchangeRateToUSD = exchangeRateToUSD;
    }

    public double getExchangeRateToUSD() {
        return exchangeRateToUSD;
    }

    public static void main(String[] args) {

        for (Currency currency : Currency.values()) {
            if (currency != Currency.USD) {
                System.out.printf("Converting %s to USD=%f%n", currency.name(),
                        currency.getExchangeRateToUSD());
            }
        }

    }

}

