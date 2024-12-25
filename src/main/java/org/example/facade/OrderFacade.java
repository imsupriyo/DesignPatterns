package org.example.facade;

public class OrderFacade {
    void processOrder(String stock, int quantity) {
        OrderProcessor orderProcessor = new OrderProcessor();
        if (orderProcessor.checkOrder(stock)) {
            orderProcessor.placeOrder(stock, quantity);
            orderProcessor.shipOrder();
        }
    }
}
