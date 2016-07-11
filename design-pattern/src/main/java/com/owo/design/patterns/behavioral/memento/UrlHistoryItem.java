package com.owo.design.patterns.behavioral.memento;

/**
 * Created by wangli on 7/11/16.
 */
public class UrlHistoryItem {
    private String url;

    public UrlHistoryItem(String url) {
        this.url = url;
    }

    public void save(String url) {
        this.url = url;
    }

    public String get() {
        return url;
    }
}
