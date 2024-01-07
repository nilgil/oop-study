package com.nilgil.study.oop.mart;

import java.util.Objects;

public class Bill {

    private final Money totalPrice;

    public Bill(Cart cart) {
        this(cart.totalPrice());
    }

    public Bill(Integer totalPrice) {
        this(new Money(totalPrice));
    }

    public Bill(Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Money totalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(totalPrice, bill.totalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPrice);
    }
}
