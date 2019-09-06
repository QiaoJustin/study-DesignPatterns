package com.designpatterns.structure.Builder;

/**
 * @Description 程序主类
 * @Author fuchen
 * @Date 2019/9/6 9:43
 * Version 1.0
 */
public class FastFoodOrdering {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzaBuilder = new HawaiianPizzaBuilder();
        // 此处是（4）填空
        waiter.setPizzaBuilder(hawaiian_pizzaBuilder);
        // 此处是（5）填空
        waiter.construct();


        System.out.println("pizza: " + waiter.getPizza());
    }
}
