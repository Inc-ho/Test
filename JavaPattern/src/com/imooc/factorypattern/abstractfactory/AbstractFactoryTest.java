package com.imooc.factorypattern.abstractfactory;

/**
 * Create By Min
 * 2018/3/16
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        SuitFactory suitFactory = new ChristmasSuitFactory();
        Boy boy = suitFactory.getBoy();
        boy.drawMan();
    }

}
