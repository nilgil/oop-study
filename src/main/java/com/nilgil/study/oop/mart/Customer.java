package com.nilgil.study.oop.mart;

public class Customer {

    private final Payment payment;
    private final Cart cart;

    public Customer() {
        this.payment = new Card();
        this.cart = new Cart();
    }

    public Customer(Payment payment) {
        this.payment = payment;
        this.cart = new Cart();
    }

    public void addItem(Item item) {
        cart.addItem(item);
    }

    public void dropItem(Item item) {
        cart.dropItem(item);
    }

    public boolean hasItem(Item item) {
        return cart.hasItem(item);
    }

    public Cart cart() {
        return cart;
    }

    public Money pay(Bill bill) {
        return payment.pay(bill.totalPrice());
    }

    public Money recharge(int amount) {
        return this.recharge(new Money(amount));
    }

    public Money recharge(Money amount) {
        return payment.recharge(amount);
    }
}
