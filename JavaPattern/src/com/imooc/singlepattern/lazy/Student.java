package com.imooc.singlepattern.lazy;

/**
 * 懒汉模式
 * Create By Min
 * 2018/3/16
 */
public class Student {

    //1.将构造方法私有化
    private Student(){}

    //2.声明类的唯一实例
    private static Student instance;

    //3.提供一个获取实例的方法
    public static Student getInstance(){
        if(instance==null){
            new Student();
        }
        return instance;
    }
}
