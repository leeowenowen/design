package com.owo.design.patterns.behavioral.mediator;

/**
 * Created by wangli on 16-7-11.
 */
public class User {
    private UserMediator mediator;
    private String id;

    public User(UserMediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;
        mediator.registerUser(id, this);
    }

    public void sendMessage(String toUserId, String msg) {
        System.out.println(id + " send msg [" + msg + "] to " + toUserId);
        mediator.sendMessage(id, toUserId, msg);
    }

    public void recvMessage(String fromUserId, String msg) {
        System.out.println(id + " recv msg [" + msg + "] from " + fromUserId);
    }
}
