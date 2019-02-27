package com.study.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xujiping
 * @date 2019/2/27 14:35
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {

    Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temperature = weatherData2.getTemperture();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
