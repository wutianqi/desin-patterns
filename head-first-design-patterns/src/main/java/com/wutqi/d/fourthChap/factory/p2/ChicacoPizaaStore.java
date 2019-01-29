package com.wutqi.d.fourthChap.factory.p2;

/**
 * 芝加哥披萨商店
 * @author wuqi
 * @Date 2019/1/23 10:17
 */
public class ChicacoPizaaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIntergraintFactory pizzaIntergraintFactory = new ChicacoPizzaIntergraintFactory();
        if("cheese".equals(type)){
            return new CheesePizza(pizzaIntergraintFactory);
        }
        return new PepperonPizza(pizzaIntergraintFactory);
    }
}
