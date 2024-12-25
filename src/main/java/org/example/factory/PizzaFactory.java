package org.example.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChickenPizza();
        } else {
            pizza = new VegPizza();
        }
        return pizza;
    }
}
