package com.wutqi.c.thirdChap.decorate;

/**
 * 饮料
 * @author wuqi
 * @Date 2018/12/10 14:17
 */
public abstract class Beverage {
    public String decription = "Unknown Beverage";
    public SizeEnum sizeEnum;


    public String getDecription() {
        return decription;
    }

    public abstract double cost();

    public SizeEnum getSize() {
        return sizeEnum;
    }

    public void setSize(SizeEnum sizeEnum) {
        this.sizeEnum = sizeEnum;
    }
}
