package com.wutqi.a.firstChap.strategy;

/**
 * @author wuqi
 * @Date 2018/12/6 14:23
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        this.flyBehavior = new FlyWithSwings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a Model Duck");
    }

}
