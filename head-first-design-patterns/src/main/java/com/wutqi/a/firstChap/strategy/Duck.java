package com.wutqi.a.firstChap.strategy;

/**
 * 鸭子超类
 * @author wuqi
 * @Date 2018/12/5 20:18
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void dispaly();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck is swimming!");
    }

}
