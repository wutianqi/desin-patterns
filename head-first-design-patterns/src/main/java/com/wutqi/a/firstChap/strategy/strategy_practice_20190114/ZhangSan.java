package com.wutqi.a.firstChap.strategy.strategy_practice_20190114;

/**
 * @author wuqi
 * @Date 2019/1/14 15:40
 */
public class ZhangSan extends Person {

    private ToCompanyStrategy strategy;

    public ZhangSan(ToCompanyStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void toCompany() {
        strategy.toCompany();
    }
}
