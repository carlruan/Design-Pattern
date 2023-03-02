package edu.neu.kaifengruan.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
