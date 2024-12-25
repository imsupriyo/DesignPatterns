package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;
        if (shapes.containsKey(type)) {
            shape = shapes.get(type);
        } else {
            if (type.equals("circle")) {
                shape = new Circle();
            } else {
                shape = new Rectangle();
            }
            shapes.put(type, shape);
        }
        return shape;
    }
}
