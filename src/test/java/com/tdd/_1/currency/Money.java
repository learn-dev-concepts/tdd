package com.tdd._1.currency;

public abstract class Money {
    protected int amount;

    abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.getClass().equals(money.getClass());
    }
}
