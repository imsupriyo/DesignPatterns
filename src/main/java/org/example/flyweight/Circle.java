package org.example.flyweight;

public class Circle extends Shape {
    @Override
    public void draw(String color, String fill, int radius) {
        System.out.println("Drawing Circle with color " + color + " and fill " + fill + " with radius " + radius);
    }
}
