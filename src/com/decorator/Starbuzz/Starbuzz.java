package com.decorator.Starbuzz;

import com.decorator.Starbuzz.Addons.Mocha;
import com.decorator.Starbuzz.Addons.Soy;
import com.decorator.Starbuzz.Addons.Whip;
import com.decorator.Starbuzz.Base.Beverage;
import com.decorator.Starbuzz.Base.Size;
import com.decorator.Starbuzz.Beverages.DarkRoast;
import com.decorator.Starbuzz.Beverages.Expresso;
import com.decorator.Starbuzz.Beverages.HouseBlend;

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
