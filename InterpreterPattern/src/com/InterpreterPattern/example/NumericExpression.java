package com.InterpreterPattern.example;

//算术表达式
public class NumericExpression {
    AddExpression addExp;
    SubExpression subExp;
    NumericItem NItem;
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0)
            return null;

        Integer iVal;
        NItem = new NumericItem();//项
        iVal=NItem.interpret(context);
        if (iVal==null)
            return null;
        context.setResultValue(iVal);

        /*
         * NItem.interpret(context) 会调用 NextPosition(int offset) 一次
         * 所以 getExpString() 是 ExpString.substring(CurrentPosition), 即 context.getExpString()为 "当前项值" 后面的表达式
         * context.getExpString().length()==0 表达的意思是: 后面没有表达式了
         * */
        if (context.getExpString().length()==0)
            return context.getResultValue();

        String c = context.getExpString().substring(0, 1);
        while (c.equals("+")||c.equals("-")) {
            context.NextPosition(1);
            switch (c) {
                case "+":
                    addExp = new AddExpression();
                    addExp.interpret(context);
                    break;
                case "-":
                    subExp = new SubExpression();
                    subExp.interpret(context);
                    break;
            }
            if (context.getExpString().length()==0)
                return context.getResultValue();

            c = context.getExpString().substring(0, 1);
        }
        return context.getResultValue();
    }
}
