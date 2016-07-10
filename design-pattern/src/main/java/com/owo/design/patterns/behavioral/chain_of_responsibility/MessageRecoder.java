package com.owo.design.patterns.behavioral.chain_of_responsibility;

/**
 * Created by wangli on 16-7-10.
 */
public class MessageRecoder extends LayerMessageHandler {
    public MessageRecoder(MessageHandler next) {
        super(next);
    }

    @Override
    public void handleMessage(String msg) {
        System.out.println("MessageRecoder.handleMessage:" + msg);
        super.handleMessage(msg);
    }
}
