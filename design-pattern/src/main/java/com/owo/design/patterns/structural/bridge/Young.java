package com.owo.design.patterns.structural.bridge;

/**
 * Created by wangli on 16-7-9.
 */
public class Young extends Person {

    public Young(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void goOut() {
        System.out.println("Young.goOut:");
        vehicle.run();
    }
}
