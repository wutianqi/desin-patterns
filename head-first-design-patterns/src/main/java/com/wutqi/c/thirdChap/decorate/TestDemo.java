package com.wutqi.c.thirdChap.decorate;

/**
 * @author wuqi
 * @Date 2018/12/10 14:35
 */
public class TestDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(SizeEnum.SAMLL);
        Mocha mocha = new Mocha(beverage);
        SizeDecorator sizeDecorator = new SizeDecorator(mocha);
        System.out.println(sizeDecorator.getDescription() + ",cost$" + sizeDecorator.cost());
    }
}
