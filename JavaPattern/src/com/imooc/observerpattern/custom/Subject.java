package com.imooc.observerpattern.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,提供注册删除观察者的接口
 * Create By Min
 * 2018/3/19
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //attach detach notifyobserver

    /**
     * 添加一个观察者对象
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除一个观察者对象
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers(){
        for (Observer observer:observers){
            observer.update(this);
        }
    }
}
