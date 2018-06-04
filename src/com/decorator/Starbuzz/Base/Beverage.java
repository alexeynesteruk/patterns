package com.decorator.Starbuzz.Base;

public abstract class Beverage {
    protected String _description = "Unknown Beverage";
    protected Size _size = Size.S;

    public String getDescription(){
        return _description;
    }
    public abstract double cost();
    public void setSize(Size s){
        _size = s;
    }
    public Size getSize(){
        return _size;
    }
}