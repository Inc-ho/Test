package com.imooc.observerpattern.custom;

/**
 * 观察者接口,定义一个更新的接口那些在目标发生改变的时候被通知的对象
 * Create By Min
 * 2018/3/19
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象方便获取相应的目标对象的状态
     */
    public void update(Subject subject);

}
