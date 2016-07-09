package com.owo.design.patterns.creational.prototype;


public class PrototypePatternDemo {
    public static void main() {
        Message message = new Message();
        message.pub("key1", "value1");
        Message message2 = message.obtain();
        message2.pub("key1", "value2");
        System.out.println("message.key1:" + message.get("key1"));
        System.out.println("message.key1:" + message2.get("key1"));
    }
}