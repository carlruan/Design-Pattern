package me.kaifengruan.decorator;

public class Coffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        pt(espresso);
        Beverage mochaEspress = new MochaCondiment(espresso);
        pt(mochaEspress);
        Beverage mochaMochaEspress = new MochaCondiment(mochaEspress);
        pt(mochaMochaEspress);

    }

    public static void pt(Beverage beverage){
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
