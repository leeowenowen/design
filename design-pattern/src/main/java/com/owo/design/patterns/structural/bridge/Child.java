package com.owo.design.patterns.structural.bridge;

/**
 * Created by wangli on 16-7-9.
 */
public class Child extends Person {

    public Child(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void goOut() {
        System.out.println("Child.goOut:");
        vehicle.run();
    }
}
