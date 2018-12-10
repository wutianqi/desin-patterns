package com.wutqi.a.firstChap.strategy;

/**
 * 会飞的行为实现类
 * @author wuqi
 * @Date 2018/12/5 20:22
 */
public class FlyWithSwings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
