package com.StatePattern;

import com.StatePattern.example.Work;
import com.StatePattern.sample.ConcreteStateA;
import com.StatePattern.sample.Context;

public class Main {

    public static void main(String[] args) {
	    // sample code
        {
            //设置Context的初始状态为ConcreteStateA
//            Context c = new Context(new ConcreteStateA());
//
//            c.Request();
//            c.Request();
//            c.Request();
//            c.Request();
        }

        //example
        {
            //紧急项目
            Work emergencyProjects = new Work();

            emergencyProjects.setHour(9);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(10);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(12);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(13);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(14);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(17);
            //emergencyProjects.setFinish(true);
            emergencyProjects.setFinish(false);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(19);
            emergencyProjects.WriteProgram();

            emergencyProjects.setHour(22);
            emergencyProjects.WriteProgram();
        }
    }
}
