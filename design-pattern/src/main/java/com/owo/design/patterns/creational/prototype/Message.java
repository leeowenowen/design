package com.owo.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangli on 16-7-9.
 */
public class Message {
    private Map<String, String> params = new HashMap<>();

    public Message() {

    }

    public void pub(String k, String v) {
        params.put(k, v);
    }

    public String get(String k) {
        return params.get(k);
    }

    public Message obtain() {
        Message msg = new Message();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            msg.params.put(entry.getKey(), entry.getValue());
        }
        return msg;
    }
}
