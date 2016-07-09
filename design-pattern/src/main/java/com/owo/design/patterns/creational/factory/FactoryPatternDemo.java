package com.owo.design.patterns.creational.factory;

/**
 * Created by wangli on 7/8/16.
 */
public class FactoryPatternDemo {
    public static void main() {
        ShapeFactory factory = new ShapeFactory();
        String[] shapeNames = new String[]{
                "rectangle",
                "square",
                "circle"
        };
        for (String name : shapeNames) {
            Shape shape = factory.create(name);
            shape.draw();
        }
    }
}
