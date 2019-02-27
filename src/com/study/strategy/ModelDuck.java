package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:46
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a modal duck");
    }
}
