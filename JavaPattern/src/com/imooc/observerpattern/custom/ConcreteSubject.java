package com.imooc.observerpattern.custom;

/**
 * 具体的目标对象,负责把有关状态存入到相应的观察者对象中
 * Create By Min
 * 2018/3/19
 */
public class ConcreteSubject extends Subject{

//    目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
