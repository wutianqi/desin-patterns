package com.wutqi.a.firstChap.strategy;

/**
 * 不会叫的鸭子
 * @author wuqi
 * @Date 2018/12/5 20:25
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
