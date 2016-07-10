package com.owo.design.patterns.structural.decorator;

/**
 * Created by wangli on 16-7-10.
 */
public class CarWithStatistic implements Car {
    private static final String TAG = "CarWithStatistic";
    private Car car;

    public CarWithStatistic(Car car) {
        this.car = car;
    }

    @Override
    public void open() {
        Statisitc.info(TAG, "CarWithStatistic.open");
        car.open();
    }

    @Override
    public void run() {
        Statisitc.info(TAG, "CarWithStatistic.run");
        car.run();
    }
}
