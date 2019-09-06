package com.designpatterns.structure.Builder;

/**
 * @Description 制作不同的披萨
 * @Author fuchen
 * @Date 2019/9/6 9:32
 * Version 1.0
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    // 此处是（1）填空
    public abstract void buildParts();
}
