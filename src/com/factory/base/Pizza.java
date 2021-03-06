package com.factory.base;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings:");
        toppings.forEach((t)->System.out.println("   " + t));
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
