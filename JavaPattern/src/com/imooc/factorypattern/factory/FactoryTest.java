package com.imooc.factorypattern.factory;

/**
 * 工厂模式测试
 * Create By Min
 * 2018/3/16
 */
public class FactoryTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

/*        HairInterface hairInterface = new LeftHair();
        hairInterface.draw();*/

/*        HairFactory hairFactory = new HairFactory();
        HairInterface hairInterface = hairFactory.getHair("right");
        hairInterface.draw();*/

        HairFactory hairFactory = new HairFactory();
        HairInterface hairInterface = hairFactory.getHairByClass(LeftHair.class);
        hairInterface.draw();
    }

}
