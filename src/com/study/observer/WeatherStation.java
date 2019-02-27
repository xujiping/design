package com.study.observer;

/**
 * 观察者模式
 * 定义了对象之前的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 *
 * @author xujiping
 * @date 2019/2/27 14:17
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(81, 65, 30.4f);

    }
}
