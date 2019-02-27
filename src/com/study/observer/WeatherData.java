package com.study.observer;

import java.util.ArrayList;

/**
 * @author xujiping
 * @date 2019/2/27 14:06
 */
public class WeatherData implements Subject {

    private ArrayList observers;

    private float temperture;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperture, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperture, float humidity, float pressure){
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
