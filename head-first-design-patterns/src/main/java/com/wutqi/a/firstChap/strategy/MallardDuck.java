package com.wutqi.a.firstChap.strategy;

/**
 * 野鸭子
 * @author wuqi
 * @Date 2018/12/5 20:31
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        this.flyBehavior = new FlyWithSwings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a MallardDuck");
    }
}
