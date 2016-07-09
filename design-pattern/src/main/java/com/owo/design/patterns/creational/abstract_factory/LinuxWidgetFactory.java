package com.owo.design.patterns.creational.abstract_factory;

/**
 * Created by wangli on 16-7-9.
 */
public class LinuxWidgetFactory implements  WidgetFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextView createTextView() {
        return new WinTextView();
    }
}
