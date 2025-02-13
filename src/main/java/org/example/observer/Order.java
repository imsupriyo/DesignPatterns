package org.example.observer;

import java.util.ArrayList;
import java.util.List;

// concrete subject/ observable class
public class Order {
    private double total;
    private double price;
    private int count;
    private double discount;

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(double price) {
        total += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    public double getTotal() {
        return total - getDiscount();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "total=" + total +
                ", price=" + price +
                ", count=" + count +
                ", discount=" + discount +
                '}';
    }
}
