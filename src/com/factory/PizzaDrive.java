package com.factory;

import com.factory.PizzaStores.CGPizzaStore;
import com.factory.PizzaStores.NYPizzaStore;
import com.factory.base.Pizza;
import com.factory.base.PizzaStore;

public class PizzaDrive {
    public static void main(String[] args){
        PizzaStore NYStore = new NYPizzaStore();
        PizzaStore CGStore = new CGPizzaStore();

        Pizza pizza = NYStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = CGStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}