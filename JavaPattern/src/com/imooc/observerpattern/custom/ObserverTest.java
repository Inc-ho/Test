package com.imooc.observerpattern.custom;

/**
 * Create By Min
 * 2018/3/19
 */
public class ObserverTest {

    //创建目标

    //创建观察者

    //注册观察者

    //目标更新

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);

        concreteSubject.setSubjectState("今天下雨！");
    }

}
