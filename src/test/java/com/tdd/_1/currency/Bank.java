package com.tdd._1.currency;

public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
