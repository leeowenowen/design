package com.owo.design.patterns.creational.singleton;

/**
 * Created by wangli on 16-7-9.
 */
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public static final Singleton2 getInstance() {
        return singleton;
    }

    public void show() {
        System.out.println("show from " + this);
    }
}
