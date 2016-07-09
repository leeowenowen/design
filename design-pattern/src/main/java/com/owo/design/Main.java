package com.owo.design;

import com.owo.design.patterns.creational.abstract_factory.AbstractFactoryPatternDemo;
import com.owo.design.patterns.creational.factory.FactoryPatternDemo;

/**
 * Created by wangli on 7/8/16.
 */
public class Main {
    private static void showTitle(String title) {
        System.out.println("------------------------------" + title);
    }

    public static void main(String[] args) {
        showTitle("Factory Pattern Demo");
        FactoryPatternDemo.main();
        showTitle("Abstract Factory Pattern Demo");
        AbstractFactoryPatternDemo.main();
    }
}
