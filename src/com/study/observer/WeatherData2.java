package com.study.observer;

import java.util.Observable;

/**
 * @author xujiping
 * @date 2019/2/27 14:32
 */
public class WeatherData2 extends Observable {

    private float temperture;

    private float humidity;

    private float pressure;

    public WeatherData2() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperture = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperture() {
        return temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
