package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void price() {
        Item item = new Item("상품명", 10000);
        Assertions.assertEquals(item.price(), new Money(10000));
    }
}