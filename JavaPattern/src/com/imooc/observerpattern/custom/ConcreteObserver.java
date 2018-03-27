package com.imooc.observerpattern.custom;

/**
 * 具体的观察者对象,实现更新的方法,使自身的状态和目标保持一致
 * Create By Min
 * 2018/3/19
 */
public class ConcreteObserver implements Observer{
    //观察者的状态
    private String observerState;

    /**
     * 获取目标类的状态同步到观察者状态中
     * @param subject 传入目标对象方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
        System.out.println(observerState);
    }
}
