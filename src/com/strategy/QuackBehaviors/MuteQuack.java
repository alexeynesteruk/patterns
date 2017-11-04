package com.strategy.QuackBehaviors;

import com.strategy.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
