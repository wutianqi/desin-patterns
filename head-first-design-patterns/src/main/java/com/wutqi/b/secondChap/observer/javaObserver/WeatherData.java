package com.wutqi.b.secondChap.observer.javaObserver;

/**
 * 气象观测站,使用Java内置的Observable对象作为超类
 * @author wuqi
 * @Date 2018/12/6 21:36
 */
public class WeatherData extends java.util.Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementsChanged() {
        //先改变状态
        setChanged();
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
