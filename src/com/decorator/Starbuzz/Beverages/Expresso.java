package com.decorator.Starbuzz.Beverages;

import com.decorator.Starbuzz.Base.Beverage;

public class Expresso extends Beverage {

    public Expresso(){
        _description = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
