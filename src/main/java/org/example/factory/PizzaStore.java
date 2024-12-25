package org.example.factory;

public class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}
