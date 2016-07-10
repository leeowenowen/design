package com.owo.design.patterns.behavioral.mediator;

/**
 * Created by wangli on 16-7-11.
 */
public interface UserMediator {
    void sendMessage(String fromUserId, String toUserId, String msg);

    void registerUser(String id, User user);
}
