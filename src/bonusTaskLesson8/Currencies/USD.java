package bonusTaskLesson8.Currencies;

public class USD extends Money {
     USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
