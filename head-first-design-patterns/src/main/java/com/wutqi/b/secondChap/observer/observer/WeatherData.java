package com.wutqi.b.secondChap.observer.observer;

import java.util.ArrayList;

/**
 * 气象观测站
 * @author wuqi
 * @Date 2018/12/6 21:36
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
