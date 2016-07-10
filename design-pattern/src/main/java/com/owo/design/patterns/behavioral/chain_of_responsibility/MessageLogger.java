package com.owo.design.patterns.behavioral.chain_of_responsibility;

import java.util.logging.Logger;

/**
 * Created by wangli on 16-7-10.
 */
public class MessageLogger extends LayerMessageHandler {
    public MessageLogger(MessageHandler next) {
        super(next);
    }

    @Override
    public void handleMessage(String msg) {
        System.out.println("MessageLogger.handleMessage:" + msg);
        super.handleMessage(msg);
    }
}
