package com.wutqi.c.thirdChap.decorate;

/** 浓缩咖啡
 * @author wuqi
 * @Date 2018/12/10 14:31
 */
public class Espresso extends Beverage {

    public Espresso(){
        decription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
