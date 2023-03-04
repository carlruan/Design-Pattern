package me.kaifengruan.factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        return new ChicagoStyleCheesePizza();
    }
}
