package com.decorator.Addons;

import com.decorator.Base.*;

public class Whip extends CondimentDecorator{
    private Beverage _beverage;

    public Whip(Beverage beverage){
        this._beverage = beverage;
    }

    public String getDescription() {
        return _beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.1 + _beverage.cost();
    }
}