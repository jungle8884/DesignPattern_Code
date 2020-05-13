package com.FlyweightPattern;

public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:" + extrinsicstate);
    }
}
