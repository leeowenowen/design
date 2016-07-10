package com.owo.design.patterns.behavioral.command;

import com.owo.design.patterns.creational.abstract_factory.*;

public class CommandPatternDemo {
    public static void main() {
        TextView tv = new TextView(new TextChangeCommand());
        tv.changeText("textabc");
    }
}