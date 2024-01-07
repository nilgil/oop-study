package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        this.cart = new Cart();
    }

    @Test
    void addItem() {
        Item item = new Item("상품명", 30000);

        cart.addItem(item);

        Assertions.assertTrue(cart.hasItem(item));
    }

    @Test
    void dropItem() {
        Item item = new Item("상품명", 10000);
        cart.addItem(item);
        Assertions.assertTrue(cart.hasItem(item));
        cart.dropItem(item);
        Assertions.assertFalse(cart.hasItem(item));
    }

    @Test
    void totalPrice() {
        Item item1 = new Item("상품1", 10000);
        Item item2 = new Item("상품2", 20000);
        cart.addItem(item1);
        cart.addItem(item2);

        Money price = cart.totalPrice();

        Assertions.assertEquals(price, new Money(30000));
    }
}