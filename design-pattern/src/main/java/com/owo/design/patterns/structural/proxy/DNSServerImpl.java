package com.owo.design.patterns.structural.proxy;

/**
 * Created by wangli on 16-7-10.
 */
public class DNSServerImpl implements DNSServer {
    @Override
    public String request(String domain) {
        return "ip of " + domain;
    }
}
