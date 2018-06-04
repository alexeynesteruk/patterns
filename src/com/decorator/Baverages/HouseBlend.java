package com.decorator.Baverages;

import com.decorator.Base.Baverage;

public class HouseBlend extends Baverage {
    public HouseBlend(){
        _description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}