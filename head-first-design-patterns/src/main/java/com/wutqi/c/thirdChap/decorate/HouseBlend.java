package com.wutqi.c.thirdChap.decorate;

/**
 * @author wuqi
 * @Date 2018/12/10 14:32
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        decription = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
