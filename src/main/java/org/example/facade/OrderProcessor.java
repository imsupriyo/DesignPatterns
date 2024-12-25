package org.example.facade;

public class OrderProcessor {
    boolean checkOrder(String stockName) {
        System.out.println("Checking order...");
        return true;
    }
    void placeOrder(String stockName, int quantity) {
        System.out.println("Placing order " + stockName + " with quantity " + quantity);
    }

    void shipOrder() {
        System.out.println("Shipping order...");
    }
}
