package org.example.observer;

public class PriceObserver implements OrderObserver{
    @Override
    public void updated(Order order) {
        System.out.println("Setting discount..");
        if (order.getTotal() > 100) {
            order.setDiscount(10);
        } else {
            order.setDiscount(5);
        }
    }
}
