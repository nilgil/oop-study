package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void addItem() {
        Item item = new Item("추가상품", 30000);
        Customer customer = new Customer();
        customer.addItem(item);
        Assertions.assertTrue(customer.hasItem(item));
    }

    @Test
    void pay() {
        Card card = new Card(100000);
        Customer customer = new Customer(card);

        Bill bill = new Bill(10000);
        Money balance = customer.pay(bill);

        Assertions.assertEquals(balance, new Money(90000));
    }

    @Test
    void recharge() {
        Customer customer = new Customer();

        Money balance = customer.recharge(10000);

        Assertions.assertEquals(balance, new Money(10000));
    }
}