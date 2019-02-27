package com.study.strategy;

/**
 * strategy
 * 定义：定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
 * 把算法/行为分离，把变化的分离。继承相同部分，组合不同部分。
 * @author xujiping
 * @date 2019/2/27 11:38
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck(new Quack(), new FlyNoWay());
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
