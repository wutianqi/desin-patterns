package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 冰箱
 * @author wuqi
 * @Date 2019/1/29 13:30
 */
public class Refrigerator {
    public static final Integer ON = 1;
    public static final Integer OFF = 0;
    private Integer status = OFF;

    public void on(){
        this.status = ON;
        System.out.println("the refrigerator is on...");
    }

    public void off(){
        this.status = OFF;
        System.out.println("the refrigerator is off...");
    }

    public Integer getStatus(){
        return this.status;
    }
}
