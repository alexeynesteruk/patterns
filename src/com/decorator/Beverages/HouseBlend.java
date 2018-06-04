package com.decorator.Beverages;

import com.decorator.Base.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        _description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}