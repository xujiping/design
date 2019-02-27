package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:35
 */
public class FlyNoWay implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
