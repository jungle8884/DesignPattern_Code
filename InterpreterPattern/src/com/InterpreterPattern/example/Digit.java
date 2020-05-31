package com.InterpreterPattern.example;

//数字
public class Digit extends NumericExpression {
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0) return null;
        String c=context.getExpString().substring(0, 1);
        if (c.compareTo("0")>=0&&c.compareTo("9")<=0) {
            context.NextPosition(1);
            return Integer.parseInt(c);
        } else return null;
    }
}
