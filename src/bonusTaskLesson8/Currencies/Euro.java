package bonusTaskLesson8.Currencies;

public class Euro extends Money {
    Euro(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }
}
