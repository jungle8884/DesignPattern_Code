package com.StrategyPattern.sample;

public class ConcreteStrategyA extends Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B实现.");
    }
}
