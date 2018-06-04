package com.decorator.Beverages;

import com.decorator.Base.Beverage;

public class Expresso extends Beverage {

    public Expresso(){
        _description = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
