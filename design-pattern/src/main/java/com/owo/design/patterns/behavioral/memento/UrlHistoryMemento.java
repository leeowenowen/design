package com.owo.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangli on 7/11/16.
 */
public class UrlHistoryMemento {
    private List<UrlHistoryItem> historyList = new ArrayList<>();

    public void add(UrlHistoryItem item) {
        historyList.add(item);
    }

    public UrlHistoryItem get(int index) {
        return historyList.get(index);
    }
}
