package com.owo.design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangli on 16-7-10.
 */
public class DNSServerProxy implements DNSServer {
    private DNSServer server;

    public DNSServerProxy(DNSServer server) {
        this.server = server;
    }

    Map<String, String> cache = new HashMap<>();

    @Override
    public String request(String domain) {
        String ip = cache.get(domain);
        if (ip == null) {
            ip = server.request(domain);
            cache.put(domain, ip);
        }
        return ip;

    }
}
