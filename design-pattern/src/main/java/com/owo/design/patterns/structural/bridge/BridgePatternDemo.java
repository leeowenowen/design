package com.owo.design.patterns.structural.bridge;

public class BridgePatternDemo {
    public static void main() {
        new Elder(new Bus()).goOut();
        new Elder(new Car()).goOut();
        new Elder(new Bicycle()).goOut();
        new Child(new Bus()).goOut();
        new Child(new Car()).goOut();
        new Child(new Bicycle()).goOut();
        new Young(new Bus()).goOut();
        new Young(new Car()).goOut();
        new Young(new Bicycle()).goOut();
    }
}