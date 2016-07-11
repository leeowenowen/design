package com.owo.design.patterns.behavioral.state;

/**
 * Created by wangli on 7/11/16.
 */
public class FinishedState implements State {
    @Override
    public void handleEvent(Context context, Event event) {
        switch (event) {
            case EV_START:
                System.out.println("FinishedState.handleEvent EV_START:  starting");
                break;
            case EV_CANCEL:
                System.out.println("FinishedState.handleEvent EV_CANCEL:  has stopped , do nothing");
                break;
            default:
                break;
        }
    }
}
