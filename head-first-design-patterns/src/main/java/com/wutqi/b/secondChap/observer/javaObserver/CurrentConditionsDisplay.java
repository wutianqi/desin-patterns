package com.wutqi.b.secondChap.observer.javaObserver;

import com.wutqi.b.secondChap.observer.observer.DispalyElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前状况
 * @author wuqi
 * @Date 2018/12/6 21:34
 */
public class CurrentConditionsDisplay implements Observer,DispalyElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
