package com.owo.design.patterns.creational.abstract_factory;

/**
 * Created by wangli on 16-7-9.
 */

public class WinTextView implements TextView {
    @Override
    public void show() {
        System.out.println("WinTextView:show");
    }
}