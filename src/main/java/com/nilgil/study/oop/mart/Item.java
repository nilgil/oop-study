package com.nilgil.study.oop.mart;

import java.util.Objects;

public class Item {

    private final String name;
    private final Money price;

    public Item(String name, int price) {
        this(name, new Money(price));
    }

    public Item(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Money price() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
