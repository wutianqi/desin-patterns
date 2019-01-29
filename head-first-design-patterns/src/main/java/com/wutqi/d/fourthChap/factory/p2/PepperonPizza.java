package com.wutqi.d.fourthChap.factory.p2;

/**
 * 芝加哥火腿披萨
 * @author wuqi
 * @Date 2019/1/23 10:19
 */
public class PepperonPizza extends Pizza {
    private PizzaIntergraintFactory pizzaIntergraintFactory;

    public PepperonPizza(PizzaIntergraintFactory pizzaIntergraintFactory){
        this.pizzaIntergraintFactory = pizzaIntergraintFactory;
    }

    @Override
    public void prepare() {
        System.out.println();
        this.sauce = pizzaIntergraintFactory.getSauce();
        this.dough = pizzaIntergraintFactory.getTaugth();
    }
}
