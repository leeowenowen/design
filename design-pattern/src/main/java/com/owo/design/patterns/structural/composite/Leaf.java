package com.owo.design.patterns.structural.composite;

/**
 * Created by wangli on 16-7-10.
 */
public class Leaf implements Component {
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void show() {
        System.out.println("Leaf.show");
    }
}
