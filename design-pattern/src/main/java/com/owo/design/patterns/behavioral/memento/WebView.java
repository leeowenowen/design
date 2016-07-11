package com.owo.design.patterns.behavioral.memento;

/**
 * Created by wangli on 7/11/16.
 */
public class WebView {
    private UrlHistoryMemento memento = new UrlHistoryMemento();

    public void load(String url) {
        memento.add(new UrlHistoryItem(url));
    }

    public void restore(int step) {
        String url = memento.get(step).get();
        System.out.println("restore to url: " + url);
    }
}
