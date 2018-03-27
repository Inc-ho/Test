package com.imooc.proxypattern.staticproxy;

/**
 * 使用继承方式实现静态代理
 * Create By Min
 * 2018/3/21
 */
public class Car2 extends Car{

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        super.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...用时:"+(endtime-starttime));
    }
}
