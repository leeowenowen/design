package com.owo.design.patterns.behavioral.memento;

public class MementoPatternDemo {
    public static void main() {
        WebView webView = new WebView();
        webView.load("www.baidu.com");
        webView.load("g.cn");
        webView.restore(0);
    }
}