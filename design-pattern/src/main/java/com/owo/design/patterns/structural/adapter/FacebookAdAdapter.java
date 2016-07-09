package com.owo.design.patterns.structural.adapter;

/**
 * Created by wangli on 16-7-9.
 */
public class FacebookAdAdapter implements AdAdapter {
    private FacebookAd facebookAd = new FacebookAd();

    @Override
    public void showBanner(String id) {
        facebookAd.showBanner(id, null);
    }
}
