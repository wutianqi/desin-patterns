package com.wutqi.b.secondChap.observer.observer;

/**
 * 气象站
 * @author wuqi
 * @Date 2018/12/6 22:17
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeadIndexDisplay headIndexDisplay = new HeadIndexDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
    }
}
