package com.decorator.Starbuzz.Beverages;

import com.decorator.Starbuzz.Base.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        _description = "Dark Roast Coffee";
        switch (getSize()){
            case M: _description +=" (Medium)"; break;
            case L: _description +=" (Large)"; break;
        }
    }

    public double cost() {
        double price = 0.99;
        switch (getSize()){
            case M: price += 0.3; break;
            case L: price += 0.4; break;
        }
        return price;
    }
}