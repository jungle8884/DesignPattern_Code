package com.InterpreterPattern.sample;

public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
