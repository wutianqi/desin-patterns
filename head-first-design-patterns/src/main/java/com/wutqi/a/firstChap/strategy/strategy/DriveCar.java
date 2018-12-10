package com.wutqi.a.firstChap.strategy.strategy;

/**
 * 开车回家
 * @author wuqi
 * @Date 2018/12/6 16:31
 */
public class DriveCar implements GoHomeStrategy {
    @Override
    public void goHome() {
        System.out.println("go home by drive car");
    }
}
