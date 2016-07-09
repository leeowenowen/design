package com.owo.design.patterns.creational.singleton;

/**
 * Created by wangli on 16-7-9.
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static Singleton4 singleton = new Singleton4();
    }

    private Singleton4() {
    }

    public static final Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }

    public void show() {
        System.out.println("show from " + this);
    }
}
