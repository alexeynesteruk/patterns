package com.decorator;

import com.decorator.Addons.Mocha;
import com.decorator.Addons.Soy;
import com.decorator.Addons.Whip;
import com.decorator.Base.Beverage;
import com.decorator.Base.Size;
import com.decorator.Beverages.DarkRoast;
import com.decorator.Beverages.Expresso;
import com.decorator.Beverages.HouseBlend;

public class Starbuzz {
    public static void main(String args[]){
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Size.L);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
