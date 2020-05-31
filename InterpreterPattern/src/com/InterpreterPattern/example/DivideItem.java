package com.InterpreterPattern.example;

//除项
public class DivideItem extends NumericExpression {
    NumericValue NVale;
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0) return null;
        Integer iVal;
        NVale = new NumericValue();
        iVal=NVale.interpret(context);
        if (iVal==null) return null;
        context.setItemValue(context.getItemVale()/iVal);
        return context.getItemVale();
    }
}
