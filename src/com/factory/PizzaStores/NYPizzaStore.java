package com.factory.PizzaStores;

import com.factory.Pizzas.NYCheesePizza;
import com.factory.base.Pizza;
import com.factory.base.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type){
      switch (type){
          case "cheese": return new NYCheesePizza();
          default: return null;
      }
    }
}