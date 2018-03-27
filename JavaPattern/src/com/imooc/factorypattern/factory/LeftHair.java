package com.imooc.factorypattern.factory;

/**
 * 左发型
 * Create By Min
 * 2018/3/16
 */
public class LeftHair implements HairInterface{
    @Override
    public void draw() {
        System.out.println("实现左偏分发型！");
    }
}
