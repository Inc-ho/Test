package com.imooc.factorypattern.abstractfactory;

/**
 * 圣诞套装加工厂
 * Create By Min
 * 2018/3/16
 */
public class ChristmasSuitFactory implements SuitFactory{
    @Override
    public Boy getBoy() {
        return new ChristmasSuitBoy();
    }

    @Override
    public Girl getGirl() {
        return new ChristmasSuitGirl();
    }
}
