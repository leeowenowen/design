package com.owo.design.patterns.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main() {
        UserMediator mediator = new UserMediatorImpl();
        User u1 = new User(mediator, "user1");
        User u2 = new User(mediator, "user2");
        User u3 = new User(mediator, "user3");

        u1.sendMessage("user2", "i'm user1");
        u1.sendMessage("user3", "i'm user1");
        u2.sendMessage("user1", "i'm user2");
        u2.sendMessage("user3", "i'm user2");
    }
}