package com.wutqi.d.fourthChap.factory.p2;

/**
 * 纽约芝士披萨
 * @author wuqi
 * @Date 2019/1/23 10:14
 */
public class CheesePizza extends Pizza {

    PizzaIntergraintFactory pizzaIntergraintFactory;

    public CheesePizza(PizzaIntergraintFactory pizzaIntergraintFactory){
        this.pizzaIntergraintFactory = pizzaIntergraintFactory;
    }

    @Override
    public void prepare() {
        System.out.println();
        this.sauce = pizzaIntergraintFactory.getSauce();
        this.dough = pizzaIntergraintFactory.getTaugth();
    }
}
