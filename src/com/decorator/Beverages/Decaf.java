package com.decorator.Beverages;

import com.decorator.Base.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        _description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}