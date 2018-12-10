package com.wutqi.c.thirdChap.decorate;

import com.sun.glass.ui.Size;

/**
 * 装饰大小
 * @author wuqi
 * @Date 2018/12/10 14:53
 */
public class SizeDecorator extends CondimentDecorator {
    private Beverage beverage;

    public SizeDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getSize() + "size";
    }

    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(this.getSize() == SizeEnum.SAMLL){
            return cost + 0.10;
        }

        if(this.getSize() == SizeEnum.MIDDLE){
            return cost + 0.15;
        }

        if(this.getSize() == SizeEnum.BIG){
            return cost + 0.20;
        }

        return cost;
    }
}
