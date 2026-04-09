package lesson21;

public enum Currency {
    AZN(1), USD(1.7), EUR(2);

    private double rate;

    Currency(double rate) {
        this.rate = rate;

    }


    public double convert(Currency currency, double amount) {
        return this.rate * amount * currency.rate;
    }


}
