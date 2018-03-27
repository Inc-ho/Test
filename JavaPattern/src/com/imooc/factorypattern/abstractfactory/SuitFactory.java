package com.imooc.factorypattern.abstractfactory;

/**
 * 套装加工厂
 * Create By Min
 * 2018/3/16
 */
public interface  SuitFactory {

    //男套装
    Boy getBoy();

    //女套装
    Girl getGirl();
}
