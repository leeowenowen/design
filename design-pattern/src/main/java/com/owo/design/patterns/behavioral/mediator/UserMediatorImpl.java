package com.owo.design.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangli on 16-7-11.
 */
public class UserMediatorImpl implements UserMediator {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void sendMessage(String fromUserId, String toUserId, String msg) {
        User toUser = users.get(toUserId);
        toUser.recvMessage(fromUserId, msg);
    }

    @Override
    public void registerUser(String id, User user) {
        users.put(id, user);
    }
}
