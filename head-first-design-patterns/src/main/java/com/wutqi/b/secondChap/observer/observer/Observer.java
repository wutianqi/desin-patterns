package com.wutqi.b.secondChap.observer.observer;

/**
 * 观察者
 * @author wuqi
 * @Date 2018/12/6 21:27
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
