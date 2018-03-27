package com.imooc.observerpattern.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Min
 * 2018/3/19
 */
public abstract class WeatherSubject {

    public List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObserver();

}
