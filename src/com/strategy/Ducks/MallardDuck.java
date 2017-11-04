package com.strategy.Ducks;

import com.strategy.FlyBehaviors.FlyWithWings;
import com.strategy.QuackBehaviors.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }
    public void display(){
        System.out.println("I'm real Mallard duck");
    }
}
