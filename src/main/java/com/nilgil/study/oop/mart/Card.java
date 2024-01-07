package com.nilgil.study.oop.mart;

public class Card implements Payment {

    private Money balance;

    public Card() {
        this(new Money());
    }

    public Card(int balance) {
        this(new Money(balance));
    }

    public Card(Money balance) {
        this.balance = balance;
    }

    @Override
    public Money pay(Money money) {
        balance = balance.minus(money);
        return balance;
    }

    @Override
    public Money recharge(Money money) {
        balance = balance.plus(money);
        return balance;
    }

    @Override
    public Money balance() {
        return balance;
    }
}
