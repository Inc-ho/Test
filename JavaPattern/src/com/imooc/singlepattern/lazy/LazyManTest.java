package com.imooc.singlepattern.lazy;

/**
 * 测试懒汉模式
 * Create By Min
 * 2018/3/16
 */
public class LazyManTest {

    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        if(s1==s2){
            System.out.println("s1,s2为同一实例");
        }else{
            System.out.println("s1,s2不是同一实例");
        }
    }

}
