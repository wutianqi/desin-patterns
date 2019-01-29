package com.wutqi.a.firstChap.strategy.strategy_practice_20190114;

/**
 * @author wuqi
 * @Date 2019/1/14 15:41
 */
public class WalkToCompany implements ToCompanyStrategy {
    @Override
    public void toCompany() {
        System.out.println("walk to company");
    }
}
