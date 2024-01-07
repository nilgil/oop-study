package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MartOwnerTest {

    @Test
    void calculate() {
        MartOwner martOwner = new MartOwner();

        Customer customer = new Customer();
        Item item = new Item("상품명", 20000);
        customer.addItem(item);

        Bill bill = martOwner.calculate(customer);
        Assertions.assertEquals(bill, new Bill(20000));
    }
}