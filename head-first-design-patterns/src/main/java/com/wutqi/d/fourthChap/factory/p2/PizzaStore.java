package com.wutqi.d.fourthChap.factory.p2;

/**
 * 披萨商店
 * @author wuqi
 * @Date 2018/12/13 20:50
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        //pizzaStore是不知道创建哪个pizza的，具体创建哪个pizza是由具体的子类决定的。
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
