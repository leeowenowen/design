package com.owo.design.patterns.creational.singleton;

public class SingletonPatternDemo {
    public static void main(){
        Singleton1.getInstance().show();
        Singleton1.getInstance().show();
        Singleton2.getInstance().show();
        Singleton2.getInstance().show();
        Singleton3.getInstance().show();
        Singleton3.getInstance().show();
        Singleton4.getInstance().show();
        Singleton4.getInstance().show();
    }
}
