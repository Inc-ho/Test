package com.imooc.singlepattern.hungry;

/**
 * 饿汉模式
 * Create By Min
 * 2018/3/16
 */
public class City {

    //1.将构造方法私有化
    private City(){}

    //2.创建类的唯一实例
    private static City instance = new City();

    //3.提供一个用于获取实例的方法
    public static City getInstance(){
        return instance;
    }

}
