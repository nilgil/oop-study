package com.nilgil.study.oop.mart;

import java.util.Objects;

public class Money implements Comparable<Money> {

    private final Integer value;

    public Money() {
        this(0);
    }

    public Money(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("You can only create a positive or zero amount.");
        }
        this.value = value;
    }

    public Money plus(Money money) {
        return new Money(value + money.value);
    }

    public Money minus(Money money) {
        return new Money(value - money.value);
    }

    public Integer amount() {
        return value;
    }

    @Override
    public int compareTo(Money o) {
        return value.compareTo(o.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(value, money.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
