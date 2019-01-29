package com.wutqi.a.firstChap.strategy.strategy_practice_20190114;

/**
 * @author wuqi
 * @Date 2019/1/14 15:44
 */
public class TestDemo {
    public static void main(String[] args) {
        WalkToCompany walkToCompany = new WalkToCompany();
        DriveToCompany driveToCompany = new DriveToCompany();
        ZhangSan zhangSan = new ZhangSan(walkToCompany);
        Lisi lisi = new Lisi(driveToCompany);

        zhangSan.toCompany();
        zhangSan.sleep();
        lisi.toCompany();
        lisi.sleep();
    }
}
