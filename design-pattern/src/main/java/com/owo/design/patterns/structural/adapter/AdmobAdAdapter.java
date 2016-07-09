package com.owo.design.patterns.structural.adapter;

/**
 * Created by wangli on 16-7-9.
 */
public class AdmobAdAdapter implements AdAdapter {
    private AdmobAd admobAd = new AdmobAd();

    @Override
    public void showBanner(String id) {
        admobAd.showBanner(id);
    }
}
