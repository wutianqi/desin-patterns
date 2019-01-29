package com.wutqi.d.fourthChap.factory.p2;

/**
 * 纽约风味披萨
 * @author wuqi
 * @Date 2019/1/23 10:13
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIntergraintFactory pizzaIntergraintFactory = new NYPizzaIntergraintFactory();
        if("cheese".equals(type)){
            return new CheesePizza(pizzaIntergraintFactory);
        }
        return new PepperonPizza(pizzaIntergraintFactory);
    }
}
