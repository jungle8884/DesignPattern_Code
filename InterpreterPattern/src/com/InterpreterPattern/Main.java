package com.InterpreterPattern;

import com.InterpreterPattern.example.Context;
import com.InterpreterPattern.example.NumericExpression;
//import com.InterpreterPattern.sample.AbstractExpression;
//import com.InterpreterPattern.sample.Context;
//import com.InterpreterPattern.sample.NonTerminalExpression;
//import com.InterpreterPattern.sample.TerminalExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*sample测试*/
        {
//            Context context = new Context();
//            List<AbstractExpression> list = new ArrayList<AbstractExpression>();
//            list.add(new TerminalExpression());
//            list.add(new NonTerminalExpression());
//            list.add(new TerminalExpression());
//            list.add(new TerminalExpression());
//            for (AbstractExpression exp:list
//                 ) {
//                exp.Interpret(context);
//            }
        }
        /*example测试*/
        {
            Context context = new Context();
            NumericExpression nExp = new NumericExpression();
            String expStr="12+6*3-7-7/2";
            context.setExpString(expStr);
            int x = nExp.interpret(context);
            System.out.printf("表达式 %s = %d\n",expStr ,x);
        }
    }
}
