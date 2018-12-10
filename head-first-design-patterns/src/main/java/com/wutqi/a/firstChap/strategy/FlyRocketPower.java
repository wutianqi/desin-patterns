package com.wutqi.a.firstChap.strategy;

/**
 * @author wuqi
 * @Date 2018/12/6 14:26
 */
public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket");
    }
}
