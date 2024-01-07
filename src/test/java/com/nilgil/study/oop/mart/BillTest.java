package com.nilgil.study.oop.mart;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BillTest {

    @Test
    void totalPrice() {
        Item item1 = new Item("상품1", 10000);
        Item item2 = new Item("상품2", 20000);
        Cart cart = new Cart(List.of(item1, item2));

        Bill bill = new Bill(cart);
        Money price = bill.totalPrice();

        Assertions.assertEquals(price, new Money(30000));
    }
}