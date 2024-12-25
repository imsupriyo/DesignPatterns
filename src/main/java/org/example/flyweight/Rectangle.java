package org.example.flyweight;

public class Rectangle extends Shape {
    @Override
    public void draw(String color, String fill, int length, int breadth) {
        System.out.println("Drawing Rectangle color: " + color + " fill: " + fill + " length: " + length + " breadth: " + breadth);
    }
}
