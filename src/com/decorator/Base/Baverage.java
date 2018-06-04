package com.decorator.Base;

public abstract class Baverage {
    protected String _description = "Unknown Beverage";

    public String getDescription(){
        return _description;
    }
    public abstract double cost();
}