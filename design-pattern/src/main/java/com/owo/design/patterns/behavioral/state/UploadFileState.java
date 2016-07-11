package com.owo.design.patterns.behavioral.state;

/**
 * Created by wangli on 7/11/16.
 */
public class UploadFileState implements State {
    @Override
    public void handleEvent(Context context, Event event) {
        switch(event){
            case EV_START:
                System.out.println("UploadFileState.handleEvent EV_START:  has started , do nothing");
                break;
            case EV_CANCEL:
                System.out.println("UploadFileState.handleEvent EV_CANCEL:  cancelled");
                break;
            default:
                break;
        }
    }
}
