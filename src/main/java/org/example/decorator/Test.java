package org.example.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
