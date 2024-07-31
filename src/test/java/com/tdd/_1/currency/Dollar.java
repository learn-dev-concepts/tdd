package com.tdd._1.currency;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, null);
    }

    public String currency() {
        return currency;
    }

}
