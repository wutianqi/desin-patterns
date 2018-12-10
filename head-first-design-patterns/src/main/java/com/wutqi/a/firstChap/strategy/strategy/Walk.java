package com.wutqi.a.firstChap.strategy.strategy;

/**
 * @author wuqi
 * @Date 2018/12/6 16:32
 */
public class Walk implements GoHomeStrategy {
    @Override
    public void goHome() {
        System.out.println("walk to home");
    }
}
