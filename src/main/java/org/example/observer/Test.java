package org.example.observer;

public class Test {
    public static void main(String[] args) {
        PriceObserver priceObserver = new PriceObserver();
        Order order = new Order();
        order.attach(priceObserver);
        order.addItem(200);
        System.out.println(order);
    }
}
