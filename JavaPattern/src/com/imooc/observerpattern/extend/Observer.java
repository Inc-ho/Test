package com.imooc.observerpattern.extend;

/**
 * Create By Min
 * 2018/3/19
 */
public interface Observer {

    public void update(WeatherSubject subject);

    public void setObserverName(String observerName);

    public String getObserverName();

}
