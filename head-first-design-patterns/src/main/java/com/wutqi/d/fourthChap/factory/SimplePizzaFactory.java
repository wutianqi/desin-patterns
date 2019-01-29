package com.wutqi.d.fourthChap.factory;

/**
 * 披萨工厂
 * @author wuqi
 * @Date 2018/12/13 20:35
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperonPizza();
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
