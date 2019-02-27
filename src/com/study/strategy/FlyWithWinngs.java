package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:35
 */
public class FlyWithWinngs implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
