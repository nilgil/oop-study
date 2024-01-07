package com.nilgil.study.oop.mart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Item> items;

    public Cart() {
        this(new ArrayList<>());
    }

    public Cart(Item item) {
        this(List.of(item));
    }

    public Cart(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void dropItem(Item item) {
        items.remove(item);
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    public Money totalPrice() {
        return items.stream()
                .map(Item::price)
                .reduce(new Money(), Money::plus);
    }
}
