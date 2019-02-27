package com.study.strategy;

/**
 * @author xujiping
 * @date 2019/2/27 11:37
 */
public class muteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
