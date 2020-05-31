package com.InterpreterPattern.example;

//加运算表达式
public class AddExpression extends NumericExpression {
    NumericItem NItem;
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0) return null;
        NItem = new NumericItem();
        Integer iVal;
        iVal=NItem.interpret(context);
        if (iVal==null) return null;
        context.setResultValue(context.getResultValue()+iVal);
        return context.getResultValue();
    }
}
