package com.nilgil.study.oop.mart;

public class MartOwner {

    public Bill calculate(Customer customer) {
        Cart cart = customer.cart();
        return new Bill(cart);
    }
}
