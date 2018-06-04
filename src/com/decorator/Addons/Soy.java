package com.decorator.Addons;

import com.decorator.Base.*;

public class Soy extends CondimentDecorator {
    private Beverage _beverage;

    public Soy(Beverage beverage){
        this._beverage = beverage;
    }

    public String getDescription() {
        return _beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.15 + _beverage.cost();
    }
}