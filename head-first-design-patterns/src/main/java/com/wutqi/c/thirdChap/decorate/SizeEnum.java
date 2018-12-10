package com.wutqi.c.thirdChap.decorate;

/**
 * @author wuqi
 * @Date 2018/12/10 16:04
 */
public enum SizeEnum {
    SAMLL("small"),MIDDLE("middle"),BIG("big");

    private String name;

    private SizeEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
