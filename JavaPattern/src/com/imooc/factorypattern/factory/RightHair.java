package com.imooc.factorypattern.factory;

/**
 * 右发型
 * Create By Min
 * 2018/3/16
 */
public class RightHair implements HairInterface{
    @Override
    public void draw() {
        System.out.println("实现右偏分发型！");
    }
}
