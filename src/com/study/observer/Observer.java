package com.study.observer;

/**
 * @author xujiping
 * @date 2019/2/27 14:03
 */
public interface Observer {

    public void update(float temperture, float humidity, float pressure);
}
