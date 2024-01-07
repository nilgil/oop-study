package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    void pay() {
        Card card = new Card(100000);
        card.pay(new Money(10000));
        Assertions.assertEquals(card.balance(), new Money(90000));
    }

    @Test
    void recharge() {
        Card card = new Card(100000);
        card.recharge(new Money(10000));
        Assertions.assertEquals(card.balance(), new Money(110000));
    }

    @Test
    void balance() {
        Card card = new Card(100000);
        Assertions.assertEquals(card.balance(), new Money(100000));
    }
}