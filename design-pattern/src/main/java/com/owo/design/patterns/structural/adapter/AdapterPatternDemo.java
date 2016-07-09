package com.owo.design.patterns.structural.adapter;

public class AdapterPatternDemo {
    public static void main() {
        AdAdapter adapter = new AdmobAdAdapter();
        adapter.showBanner("id");
        adapter = new FacebookAdAdapter();
        adapter.showBanner("id");
    }
}