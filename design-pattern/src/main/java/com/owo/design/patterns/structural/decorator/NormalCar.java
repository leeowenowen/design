package com.owo.design.patterns.structural.decorator;

/**
 * Created by wangli on 16-7-10.
 */
public class NormalCar implements Car {
    public void open() {
        System.out.println("NormalCar.open");
    }

    public void run() {
        System.out.println("NormalCar.run");
    }
}
