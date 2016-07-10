package com.owo.design.patterns.structural.bridge;

/**
 * Created by wangli on 16-7-9.
 */
public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("NormalCar.run");
    }
}
