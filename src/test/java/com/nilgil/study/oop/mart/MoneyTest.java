package com.nilgil.study.oop.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void plus() {
        Money money = new Money(1000);

        money = money.plus(new Money(1000));

        Assertions.assertEquals(money, new Money(2000));
    }

    @Test
    void minus() {
        Money money = new Money(10000);

        money = money.minus(new Money(1000));

        Assertions.assertEquals(money, new Money(9000));
    }

    @Test
    void amount() {
        Money money = new Money(1000);

        Assertions.assertEquals(money.amount(), 1000);
    }
}