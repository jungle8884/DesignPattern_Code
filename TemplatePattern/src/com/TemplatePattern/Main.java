package com.TemplatePattern;

import com.TemplatePattern.sample.AbstractClass;
import com.TemplatePattern.sample.ConcreteClassA;
import com.TemplatePattern.sample.ConcreteClassB;

public class Main {

    public static void main(String[] args) {
	    //sample code
        {
            AbstractClass c;

            c = new ConcreteClassA();
            c.TemplateMethod();

            c = new ConcreteClassB();
            c.TemplateMethod();
        }
    }
}
