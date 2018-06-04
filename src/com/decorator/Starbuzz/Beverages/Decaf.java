package com.decorator.Starbuzz.Beverages;

import com.decorator.Starbuzz.Base.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        _description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}