package com.owo.design.patterns.behavioral.state;

/**
 * Created by wangli on 7/11/16.
 */
public interface State {
    void handleEvent(Context context, Event event);
}
