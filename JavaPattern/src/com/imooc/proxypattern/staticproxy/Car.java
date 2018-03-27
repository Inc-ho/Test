package com.imooc.proxypattern.staticproxy;

/**
 * Create By Min
 * 2018/3/21
 */
public class Car implements Moveable{
    @Override
    public void move() {
//        long starttime = System.currentTimeMillis();
//        System.out.println("汽车开始行驶...");
        try {
            Thread.sleep(1000);
            System.out.println("汽车行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long endtime = System.currentTimeMillis();
//        System.out.println("汽车结束行驶...用时:"+(endtime-starttime));
    }
}
