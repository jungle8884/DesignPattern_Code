package com.MediatorPattern;

import com.MediatorPattern.example.ConcreteColleague1;
import com.MediatorPattern.example.ConcreteColleague2;
import com.MediatorPattern.example.ConcreteMediator;

public class Main {

    public static void main(String[] args) {
	    // example test code
        {
            ConcreteMediator m = new ConcreteMediator();

            ConcreteColleague1 c1 = new ConcreteColleague1(m);
            ConcreteColleague2 c2 = new ConcreteColleague2(m);

            m.setColleague1(c1);
            m.setColleague2(c2);

            c1.Send("吃过饭了没?");
            c2.Send("没有, 你吃了没?");
        }
    }
}
