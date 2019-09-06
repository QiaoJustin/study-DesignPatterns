package com.designpatterns.structure.Bridge;

/**
 * @Description 夏威夷披萨
 * @Author fuchen
 * @Date 2019/9/6 9:35
 * Version 1.0
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildParts() {
        pizza.setParts("cross + mild + ham&pineapple");
    }
}
