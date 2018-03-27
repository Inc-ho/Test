package com.imooc.observerpattern.java;

/**
 * Create By Min
 * 2018/3/19
 */
public class JavaObserverTest {

    public static void main(String[] args) {
        ConcreteWeatherSubject concreteWeatherSubject = new ConcreteWeatherSubject();

        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        concreteObserver1.setObserverName("张三");
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        concreteObserver2.setObserverName("李四");

        concreteWeatherSubject.addObserver(concreteObserver1);
        concreteWeatherSubject.addObserver(concreteObserver2);

        concreteWeatherSubject.setContent("今天天晴");
    }

}
