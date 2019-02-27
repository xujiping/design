package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:47
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
