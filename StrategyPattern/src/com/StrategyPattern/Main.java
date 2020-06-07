package com.StrategyPattern;

import com.StrategyPattern.sample.ConcreteStrategyA;
import com.StrategyPattern.sample.ConcreteStrategyB;
import com.StrategyPattern.sample.ConcreteStrategyC;
import com.StrategyPattern.sample.Context;

public class Main {

    public static void main(String[] args) {
	    // sample code
        {
            Context context;
            /*
            * 由于实例化不同的策略, 所以最终在调用
            * context.ContextInterface();时,
            * 所获得的结果就是不尽相同.
            * */
            context = new Context(new ConcreteStrategyA());
            context.ContextInterface();

            context = new Context(new ConcreteStrategyB());
            context.ContextInterface();

            context = new Context(new ConcreteStrategyC());
            context.ContextInterface();
        }
    }
}
