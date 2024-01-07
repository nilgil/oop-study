package com.nilgil.study.oop.mart;

public interface Payment {

    Money pay(Money money);

    Money recharge(Money money);

    Money balance();
}
