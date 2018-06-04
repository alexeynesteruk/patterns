package com.decorator.Starbuzz.Beverages;

import com.decorator.Starbuzz.Base.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        _description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}