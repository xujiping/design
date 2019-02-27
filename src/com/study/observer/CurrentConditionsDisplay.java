package com.study.observer;

/**
 * @author xujiping
 * @date 2019/2/27 14:12
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperture, float humidity, float pressure) {
        this.temperature = temperture;
        this.humidity = humidity;
        display();
    }
}
