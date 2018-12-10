package com.wutqi.b.secondChap.observer.observer;

/**
 * 主题
 * @author wuqi
 * @Date 2018/12/6 21:26
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
