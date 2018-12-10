package com.wutqi.a.firstChap.strategy.strategy;

/**
 * @author wuqi
 * @Date 2018/12/6 16:28
 */
public class People {
    /**
     * 回家这个行为的策略，或者说算法
     */
    private GoHomeStrategy strategy;

    public People(GoHomeStrategy strategy){
        this.strategy = strategy;
    }

    public void goHome(){
        strategy.goHome();
    }

    public void setStrategy(GoHomeStrategy strategy) {
        this.strategy = strategy;
    }
}
