package com.owo.design.patterns.structural.decorator;

/**
 * Created by wangli on 16-7-10.
 */
public class SafeCar implements Car {
    private Car car;

    public SafeCar(Car car) {
        this.car = car;
    }

    @Override
    public void open() {
        try {
            car.open();
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
        try {
            car.run();
        } catch (Exception e) {

        }
    }
}
