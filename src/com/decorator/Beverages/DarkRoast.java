package com.decorator.Beverages;

import com.decorator.Base.Beverage;
import com.decorator.Base.Size;

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