package org.example.facade;

public class Test {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.processOrder("Asian Paint", 20);
    }
}
