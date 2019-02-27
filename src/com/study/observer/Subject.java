package com.study.observer;

/**
 * @author xujiping
 * @date 2019/2/27 14:02
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
