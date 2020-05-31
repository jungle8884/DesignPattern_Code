package com.InterpreterPattern.example;

//减运算表达式
public class SubExpression extends NumericExpression {
    NumericItem NItem = new NumericItem();
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0) return null;
        Integer iVal;
        iVal=NItem.interpret(context);
        if (iVal==null) return null;
        context.setResultValue(context.getResultValue()-iVal);
        return context.getResultValue();
    }
}
