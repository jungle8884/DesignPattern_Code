package com.MementoPattern;

import com.MementoPattern.sample.Caretaker;
import com.MementoPattern.sample.Originator;

public class Main {

    public static void main(String[] args) {
	    // sample code
        {
            Originator o = new Originator();
            o.setState("On");
            o.Show();

            Caretaker c = new Caretaker();
            c.setMemento(o.CreateMemento());//保存备忘录---状态

            o.setState("Off");//状态改变
            o.Show();

            o.SetMemento(c.getMemento());//恢复原始状态
            o.Show();
        }
    }
}
