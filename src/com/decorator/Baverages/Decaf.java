package com.decorator.Baverages;

import com.decorator.Base.Baverage;

public class Decaf extends Baverage {
    public Decaf(){
        _description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}