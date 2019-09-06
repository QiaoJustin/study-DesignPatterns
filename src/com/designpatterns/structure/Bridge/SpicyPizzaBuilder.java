package com.designpatterns.structure.Bridge;

/**
 * @Description 辛辣披萨
 * @Author fuchen
 * @Date 2019/9/6 9:36
 * Version 1.0
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildParts() {
        pizza.setParts("pan baked + hot + pepperoni&salami");
    }
}
