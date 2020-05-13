package com.FlyweightPattern;

import java.util.Hashtable;

public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory(){
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight GetFlyweight(String key){
        return ((Flyweight)flyweights.get(key));
    }

}
