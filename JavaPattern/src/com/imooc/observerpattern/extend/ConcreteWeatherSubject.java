package com.imooc.observerpattern.extend;

/**
 * Create By Min
 * 2018/3/19
 */
public class ConcreteWeatherSubject extends WeatherSubject{

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    @Override
    protected void notifyObserver() {
//        循环所有注册的观察者
        for (Observer observer: observers) {
/*            if(条件判断){
                observer.update(this);
            }*/
        }
    }
}
