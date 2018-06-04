package com.factory.PizzaStores;

import com.factory.Pizzas.CGCheesePizza;
import com.factory.base.Pizza;
import com.factory.base.PizzaStore;

public class CGPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type){
        switch (type){
            case "cheese": return new CGCheesePizza();
            default: return null;
        }
    }
}