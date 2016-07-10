package com.owo.design.patterns.structural.facade;

/**
 * Created by wangli on 16-7-10.
 */
public class Client {
    public void process(Person p) {
        System.out.println(p.name() + " " + p.gender() + " " + p.age());
    }
}
