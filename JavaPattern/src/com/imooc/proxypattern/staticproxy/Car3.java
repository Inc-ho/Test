package com.imooc.proxypattern.staticproxy;

/**
 * 使用聚合方式实现静态代理
 * Create By Min
 * 2018/3/21
 */
public class Car3 implements Moveable{

    private Car car;

    public Car3(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...用时:"+(endtime-starttime));
    }
}
