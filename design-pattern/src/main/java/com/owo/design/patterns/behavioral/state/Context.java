package com.owo.design.patterns.behavioral.state;

/**
 * Created by wangli on 7/11/16.
 */
public class Context {
    private String uplaodFileName;
    private String serverUrl;
    private State state;

    public State switchState(State newState) {
        State pre = state;
        state = newState;
        return pre;
    }

    public String getUplaodFileName() {
        return uplaodFileName;
    }

    public void setUplaodFileName(String uplaodFileName) {
        this.uplaodFileName = uplaodFileName;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
}
