package com.wutqi.a.firstChap.strategy;

/**
 * @author wuqi
 * @Date 2018/12/5 20:33
 */
public class TestDemo {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();;
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
    }
}
