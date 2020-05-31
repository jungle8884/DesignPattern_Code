package com.InterpreterPattern.example;

//常数
public class NumericValue extends NumericExpression {
    Digit digit = new Digit();
    @Override
    public Integer interpret( Context context) {
        if (context.getExpString().length()==0)
            return null;

        Integer iVal;
        iVal = digit.interpret(context);
        if (iVal==null)
            return null;
        Integer numericVal = 0;

        while (iVal!=null) {
            numericVal = numericVal*10 + iVal;
            iVal = digit.interpret(context);
        }

        return numericVal;
    }
}
