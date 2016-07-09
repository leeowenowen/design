package com.owo.design.patterns.creational.singleton;

/**
 * Created by wangli on 16-7-9.
 */
public class Singleton3 {
    private static Singleton3 singleton;

    private Singleton3() {
    }

    public static final Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

    public void show() {
        System.out.println("show from " + this);
    }
}
