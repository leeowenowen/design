package com.owo.design.patterns.structural.composite;

public class CompositePatternDemo {

    public static void main() {
        Composite composite = new Composite();
        {
            for (int i = 0; i < 5; ++i) {
                composite.add(new Leaf());
                composite.add(new Composite());
            }
        }
        composite.show();
    }
}