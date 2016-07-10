package com.owo.design.patterns.structural.decorator;

public class DecoratorPatternDemo {
    public static void main() {
        SafeCar car = new SafeCar(new CarWithStatistic(new NormalCar()));
        car.run();
        car.open();
    }
}