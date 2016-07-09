package com.owo.design.patterns.structural.bridge;

/**
 * Created by wangli on 16-7-9.
 */
public class Elder extends Person {

    public Elder(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void goOut() {
        System.out.println("Elder.goOut:");
        vehicle.run();
    }
}
