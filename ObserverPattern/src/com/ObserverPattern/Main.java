package com.ObserverPattern;

import com.ObserverPattern.sample.ConcreteObserver;
import com.ObserverPattern.sample.ConcreteSubject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //sample测试代码
        {
            ConcreteSubject s = new ConcreteSubject();
            s.Attach(new ConcreteObserver(s, "X"));
            s.Attach(new ConcreteObserver(s, "Y"));
            s.Attach(new ConcreteObserver(s, "Z"));

            s.setSubjectState("ABC");
            s.Notify();
        }
    }
}
