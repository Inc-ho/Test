package com.imooc.singlepattern.hungry;

/**
 * 饿汉模式测试
 * Create By Min
 * 2018/3/16
 */
public class HungryManTest {

    public static void main(String[] args) {

        City city1 = City.getInstance();
        City city2 = City.getInstance();

        if(city1==city2){
            System.out.println("c1,c2是同一实例");
        }else{
            System.out.println("c1,c2不是同一实例");
        }

    }

}
