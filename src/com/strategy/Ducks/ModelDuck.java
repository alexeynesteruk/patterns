package com.strategy.Ducks;

import com.strategy.FlyBehaviors.FlyNoWay;
import com.strategy.QuackBehaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
