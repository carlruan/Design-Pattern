package me.kaifengruan.decorator;

public class MochaCondiment extends CondimentBeverage{
    public MochaCondiment(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
