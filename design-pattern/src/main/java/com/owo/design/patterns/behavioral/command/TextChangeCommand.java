package com.owo.design.patterns.behavioral.command;

/**
 * Created by wangli on 16-7-11.
 */
public class TextChangeCommand implements Command {
    private String text;

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public void execute() {
        System.out.println("TextChangeCommand.command:" + text);
    }
}
