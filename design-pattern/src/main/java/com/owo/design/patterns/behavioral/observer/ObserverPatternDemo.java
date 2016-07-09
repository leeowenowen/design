package com.owo.design.patterns.behavioral.observer;

public class ObserverPatternDemo {
    public static void main() {
        Model model = new Model();
        model.addObserver(new Observer() {
            @Override
            public void onDataChanged(String data) {
                System.out.println("observer1:" + data);
            }
        });
        model.addObserver(new Observer() {
            @Override
            public void onDataChanged(String data) {
                System.out.println("observer2:" + data);
            }
        });
        model.setData("data");
    }
}