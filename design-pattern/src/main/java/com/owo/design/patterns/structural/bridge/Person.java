package com.owo.design.patterns.structural.bridge;

/**
 * Created by wangli on 16-7-9.
 */
public abstract class Person {
    protected Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void goOut() {
        vehicle.run();
    }
}
