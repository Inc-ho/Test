package com.imooc.observerpattern.java;

import java.util.Observable;

/**
 * 天气目标的具体实现类
 * Create By Min
 * 2018/3/19
 */
public class ConcreteWeatherSubject extends Observable{
    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);//推模型
//        this.notifyObservers();//拉模型
    }
}
