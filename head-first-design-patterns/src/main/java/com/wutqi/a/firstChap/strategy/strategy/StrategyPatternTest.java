package com.wutqi.a.firstChap.strategy.strategy;

/**
 * @author wuqi
 * @Date 2018/12/6 16:34
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        GoHomeStrategy strategy = new DriveCar();
        People tom = new People(strategy);
        tom.goHome();
        System.out.println("change method");
        strategy = new Walk();
        tom.setStrategy(strategy);
        tom.goHome();

    }
}
