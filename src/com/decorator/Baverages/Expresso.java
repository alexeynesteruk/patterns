package com.decorator.Baverages;

import com.decorator.Base.Baverage;

public class Expresso extends Baverage {

    public Expresso(){
        _description = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
