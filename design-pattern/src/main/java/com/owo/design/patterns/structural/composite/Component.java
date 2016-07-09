package com.owo.design.patterns.structural.composite;

/**
 * Created by wangli on 16-7-9.
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
}
