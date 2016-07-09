package com.owo.design;

import com.owo.design.patterns.creational.abstract_factory.AbstractFactoryPatternDemo;
import com.owo.design.patterns.creational.builder.BuilderPatternDemo;
import com.owo.design.patterns.creational.factory.FactoryPatternDemo;
import com.owo.design.patterns.creational.prototype.PrototypePatternDemo;
import com.owo.design.patterns.creational.singleton.SingletonPatternDemo;
import com.owo.design.patterns.structural.adapter.AdapterPatternDemo;
import com.owo.design.patterns.structural.bridge.BridgePatternDemo;
import sun.corba.BridgePermission;

/**
 * Created by wangli on 7/8/16.
 */
public class Main {
    private static void showTitle(String title) {
        System.out.println("------------------------------" + title);
    }

    public static void main(String[] args) {
        //Creational
        showTitle("Factory Pattern Demo");
        FactoryPatternDemo.main();
        showTitle("Abstract Factory Pattern Demo");
        AbstractFactoryPatternDemo.main();
        showTitle("Singleton Pattern Demo");
        SingletonPatternDemo.main();
        showTitle("Prototype Pattern Demo");
        PrototypePatternDemo.main();
        showTitle("Builder Pattern Demo");
        BuilderPatternDemo.main();

        //Structural
        showTitle("Adapter Pattern Demo");
        AdapterPatternDemo.main();
        showTitle("Bridge Pattern Demo");
        BridgePatternDemo.main();

        //Behavioral
    }
}
