package com.imooc.proxypattern.dynamicproxy;

import com.imooc.proxypattern.staticproxy.Car;
import com.imooc.proxypattern.staticproxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 * Create By Min
 * 2018/3/22
 */
public class client {

    public static void main(String[] args) {
//        Car car = new Car();
//
//        Class cls = car.getClass();
//        InvocationHandler invocationHandler = new TimeHandler(car);
//
//        /**
//         * loader:类加载器
//         * Interfaces:实现的接口
//         * Invocationhandler
//         */
//        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),invocationHandler);
//        moveable.move();

        CglibProxy proxy = new CglibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();
    }

}
