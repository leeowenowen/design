package com.owo.design.patterns.behavioral.chain_of_responsibility;

/**
 * Created by wangli on 16-7-10.
 */
public class LayerMessageHandler implements MessageHandler {
    private MessageHandler mNext;

    public LayerMessageHandler(MessageHandler next) {
        mNext = next;
    }

    @Override
    public void handleMessage(String msg) {
        if (mNext != null) {
            mNext.handleMessage(msg);
        }
    }
}
