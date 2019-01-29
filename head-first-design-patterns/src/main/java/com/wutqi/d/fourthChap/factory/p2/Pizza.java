package com.wutqi.d.fourthChap.factory.p2;

/**
 * 披萨类
 * @author wuqi
 * @Date 2018/12/13 20:36
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;

    public abstract void prepare();

    public void bake(){

    }

    public void cut(){

    }

    public void box(){

    }

}
