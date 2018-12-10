package com.wutqi.c.thirdChap.decorate;

/**
 * 摩卡调料
 * @author wuqi
 * @Date 2018/12/10 14:33
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDecription() + ", Mocha";
    }

    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
