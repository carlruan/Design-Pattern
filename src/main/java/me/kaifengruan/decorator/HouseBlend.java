package me.kaifengruan.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House blend coffe";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
