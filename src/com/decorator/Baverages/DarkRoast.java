package com.decorator.Baverages;

import com.decorator.Base.Baverage;

public class DarkRoast extends Baverage {
    public DarkRoast(){
        _description = "Dark Roast Coffee";
    }

    public double cost() {
        return 0.99;
    }
}