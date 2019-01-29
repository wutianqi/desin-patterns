package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 14:54
 */
public class CellingFan {
    public static final Integer HIGHT = 3;
    public static final Integer MEDIUM = 2;
    public static final Integer LOW = 1;
    public static final Integer OFF = 0;
    private Integer speed;

    public CellingFan(){
        this.speed = OFF;
    }

    public void high(){
        this.speed = HIGHT;
        System.out.println("speed is high...");
    }

    public void medium(){
        this.speed = MEDIUM;
        System.out.println("speed is medium...");
    }

    public void low(){
        this.speed = LOW;
        System.out.println("speed is low...");
    }

    public void off(){
        this.speed = OFF;
        System.out.println("speed is off...");
    }

    public Integer getSpeed(){
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
