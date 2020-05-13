package com.FlyweightPattern;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("具体Flyweight:" + extrinsicstate);
    }
}
