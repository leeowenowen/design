package com.owo.design.patterns.creational.singleton;

/**
 * Created by wangli on 16-7-9.
 */
public class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1() {
    }

    public static synchronized final Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }

    public void show() {
        System.out.println("show from " + this);
    }
}
