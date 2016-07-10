package com.owo.design.patterns.behavioral.command;

/**
 * Created by wangli on 16-7-11.
 */
public class TextView {
    private TextChangeCommand command;

    public TextView(TextChangeCommand command) {
        this.command = command;
    }

    public void changeText(String text) {
        command.setText(text);
        command.execute();
    }
}
