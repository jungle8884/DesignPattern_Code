package com.InterpreterPattern.example;

//项
public class NumericItem extends NumericExpression {
    MultipleItem MItem;
    DivideItem DItem;
    NumericValue NVale;
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0) return null;
        Integer iVal;
        NVale = new NumericValue();
        iVal=NVale.interpret(context);
        if (iVal==null) return null;
        context.setItemValue(iVal);
        if (context.getExpString().length()==0)   return context.getItemVale();
        String c=context.getExpString().substring(0, 1);
        while (c.equals("*")||c.equals("/")) {
            context.NextPosition(1);
            switch (c) {
                case "*":
                    MItem = new MultipleItem();
                    MItem.interpret(context);
                    break;
                case "/":
                    DItem = new DivideItem();
                    DItem.interpret(context);
                    break;
            }
            if (context.getExpString().length()==0)   return context.getItemVale();
            c=context.getExpString().substring(0, 1);
        }
        return context.getItemVale();
    }
}
