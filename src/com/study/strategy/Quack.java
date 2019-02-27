package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:36
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
