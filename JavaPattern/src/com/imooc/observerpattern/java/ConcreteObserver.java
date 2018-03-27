package com.imooc.observerpattern.java;

import java.util.Observable;
import java.util.Observer;
/**
 * Create By Min
 * 2018/3/19
 */
public class ConcreteObserver implements  Observer{

    //观察者名称变量
    private String  observerName;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(observerName+"目标推送"+arg);//推
        System.out.println(observerName+"自己拉取"+((ConcreteWeatherSubject)o).getContent());//拉
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
