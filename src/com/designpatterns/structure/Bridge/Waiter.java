package com.designpatterns.structure.Bridge;

/**
 * @Description 前台服务员
 * @Author fuchen
 * @Date 2019/9/6 9:40
 * Version 1.0
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        // 此处是（2）填空
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void construct() {
        /* 构建pizza */
        pizzaBuilder.createNewPizza();

        // 此处是（3）填空
        pizzaBuilder.buildParts();
    }
}
