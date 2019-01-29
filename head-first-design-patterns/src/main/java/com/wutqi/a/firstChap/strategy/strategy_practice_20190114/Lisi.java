package com.wutqi.a.firstChap.strategy.strategy_practice_20190114;

/**
 * @author wuqi
 * @Date 2019/1/14 15:43
 */
public class Lisi extends Person {
    private ToCompanyStrategy strategy;

    public Lisi(ToCompanyStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void toCompany() {
        strategy.toCompany();
    }
}
