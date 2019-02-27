package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:39
 */
public class MallardDuck extends Duck {

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
