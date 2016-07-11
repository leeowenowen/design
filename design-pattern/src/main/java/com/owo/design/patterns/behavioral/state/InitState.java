package com.owo.design.patterns.behavioral.state;

/**
 * Created by wangli on 7/11/16.
 */
public class InitState implements State {
    @Override
    public void handleEvent(Context context, Event event) {
        switch (event) {
            case EV_START:
                System.out.println("InitState.handleEvent EV_START:  has started, do nothing");
                break;
            case EV_CANCEL:
                System.out.println("InitState.handleEvent EV_CANCEL:  stopped");
                break;
            default:
                break;
        }
    }
}
