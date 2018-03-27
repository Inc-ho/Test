package com.imooc.proxypattern.staticproxy;

/**
 * 静态代理测试
 * Create By Min
 * 2018/3/21
 */
public class client {
    public static void main(String[] args) {
/*
        Car car = new Car();
        car.move();
 */

    //继承
/*    Moveable m = new Car2();
    m.move();*/

    //集合
    Car car = new Car();
    Moveable m = new Car3(car);
    m.move();

    }
}
