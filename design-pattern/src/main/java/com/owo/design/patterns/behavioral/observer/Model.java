package com.owo.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangli on 16-7-9.
 */
public class Model {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setData(String data) {
        for (Observer observer : observers) {
            observer.onDataChanged(data);
        }
    }
}
