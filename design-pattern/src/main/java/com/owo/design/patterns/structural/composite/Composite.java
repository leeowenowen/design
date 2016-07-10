package com.owo.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangli on 16-7-10.
 */
public class Composite implements Component {
    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void show() {
        System.out.println("Composite.show");
        for (Component c : componentList) {
            c.show();
        }
    }
}
