package com.imooc.factorypattern.abstractfactory;

/**
 * 新年套装加工厂
 * Create By Min
 * 2018/3/16
 */
public class NewYearSuitFactory implements SuitFactory{
    @Override
    public Boy getBoy() {
        return new NewYearSuitBoy();
    }

    @Override
    public Girl getGirl() {
        return new NewYearSuitGirl();
    }
}
