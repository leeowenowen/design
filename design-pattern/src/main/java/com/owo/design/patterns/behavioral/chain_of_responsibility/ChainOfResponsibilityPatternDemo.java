package com.owo.design.patterns.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityPatternDemo {
    public static void main() {
        MessageLogger logger = new MessageLogger(new MessageRecoder(null));
        logger.handleMessage("ok");
    }
}