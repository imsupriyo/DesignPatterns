package org.example.flyweight;

public class Test {
    public static void main(String[] args) {
        ShapeFactory.getShape("circle").draw("red", "solid", 5);
        ShapeFactory.getShape("rectangle").draw("red", "dotted", 2, 4);
    }
}
