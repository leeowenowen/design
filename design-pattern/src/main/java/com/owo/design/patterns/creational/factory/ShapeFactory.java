package com.owo.design.patterns.creational.factory;

/**
 * Created by wangli on 7/8/16.
 */
public class ShapeFactory {

    public Shape create(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
        }
        return null;
    }
}
