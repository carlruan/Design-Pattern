package me.kaifengruan.decorator;

public abstract class CondimentBeverage extends Beverage{
    Beverage beverage;
    @Override
    public abstract String getDescription();
}
