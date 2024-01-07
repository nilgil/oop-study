package com.nilgil.study.oop.mart;

public class Mart {

    public static void main(String[] args) {
        MartOwner martOwner = new MartOwner();
        Item item = new Item("상품명", 10000);

        Customer customer = new Customer();
        customer.recharge(100000);
        customer.addItem(item);

        Bill bill = martOwner.calculate(customer);
        Money balance = customer.pay(bill);

        System.out.printf("잔액: %d원", balance.amount());
    }
}
