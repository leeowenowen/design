package com.owo.design.patterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main() {
        DNSServerProxy proxy = new DNSServerProxy(new DNSServerImpl());
        System.out.println("IP of " + "www.baidu.com" + proxy.request("www.baidu.com"));
        System.out.println("IP of " + "www.baidu.com" + proxy.request("www.baidu.com"));
    }
}