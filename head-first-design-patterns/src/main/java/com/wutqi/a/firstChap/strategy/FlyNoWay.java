package com.wutqi.a.firstChap.strategy;

/**
 * @author wuqi
 * @Date 2018/12/5 20:23
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
