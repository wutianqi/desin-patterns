package com.wutqi.c.thirdChap.decorate;

/**
 * 饮料装饰
 * @author wuqi
 * @Date 2018/12/10 14:21
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    @Override
    public abstract SizeEnum getSize();
}
