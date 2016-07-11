package com.owo.design;

import com.owo.design.patterns.behavioral.chain_of_responsibility.ChainOfResponsibilityPatternDemo;
import com.owo.design.patterns.behavioral.command.CommandPatternDemo;
import com.owo.design.patterns.behavioral.mediator.MediatorPatternDemo;
import com.owo.design.patterns.behavioral.memento.MementoPatternDemo;
import com.owo.design.patterns.behavioral.observer.ObserverPatternDemo;
import com.owo.design.patterns.behavioral.template.TemplatePatternDemo;
import com.owo.design.patterns.creational.abstract_factory.AbstractFactoryPatternDemo;
import com.owo.design.patterns.creational.builder.BuilderPatternDemo;
import com.owo.design.patterns.creational.factory.FactoryPatternDemo;
import com.owo.design.patterns.creational.prototype.PrototypePatternDemo;
import com.owo.design.patterns.creational.singleton.SingletonPatternDemo;
import com.owo.design.patterns.structural.adapter.AdapterPatternDemo;
import com.owo.design.patterns.structural.bridge.BridgePatternDemo;
import com.owo.design.patterns.structural.composite.CompositePatternDemo;
import com.owo.design.patterns.structural.decorator.DecoratorPatternDemo;
import com.owo.design.patterns.structural.facade.FacadePatternDemo;

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
        showTitle("Composite Pattern Demo");
        CompositePatternDemo.main();
        showTitle("Facade Pattern Demo");
        FacadePatternDemo.main();
        showTitle("Decorator Pattern Demo");
        DecoratorPatternDemo.main();


        //Behavioral
        showTitle("Chain of Responsibility Pattern Demo");
        ChainOfResponsibilityPatternDemo.main();
        showTitle("Observer Pattern Demo");
        ObserverPatternDemo.main();
        showTitle("Template Pattern Demo");
        TemplatePatternDemo.main();
        showTitle("Command Pattern Demo");
        CommandPatternDemo.main();
        showTitle("Mediator Pattern Demo");
        MediatorPatternDemo.main();
        showTitle("Memento Pattern Demo");
        MementoPatternDemo.main();
    }
}
