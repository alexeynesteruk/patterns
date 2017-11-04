package com.strategy.Ducks;

import com.strategy.Interfaces.FlyBehavior;
import com.strategy.Interfaces.QuackBehavior;

public abstract class Duck {

    private FlyBehavior _flyBehavior;
    private QuackBehavior _quackBehavior;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        _flyBehavior.fly();
    }

    public void performQuack(){
        _quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior behavior){
        _flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior){
        _quackBehavior = behavior;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
