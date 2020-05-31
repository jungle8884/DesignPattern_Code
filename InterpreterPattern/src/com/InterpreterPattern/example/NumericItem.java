package com.InterpreterPattern.example;

//项
public class NumericItem extends NumericExpression {
    MultipleItem MItem;//乘项
    DivideItem DItem;//除项
    NumericValue NVale;//常数
    @Override
    public Integer interpret(Context context) {
        if (context.getExpString().length()==0)
            return null;

        Integer iVal;
        NVale = new NumericValue();//常数

        iVal=NVale.interpret(context);
        if (iVal==null)
            return null;
        context.setItemValue(iVal);//设置当前项值

        /*
        * NVale.interpret(context) 会调用 NextPosition(int offset) 一次
        * 所以 getExpString() 是 ExpString.substring(CurrentPosition), 即 context.getExpString()为 "当前项值" 后面的表达式
        * context.getExpString().length()==0 表达的意思是: 后面没有表达式了
        * */
        if (context.getExpString().length()==0)
            return context.getItemVale();

        String c = context.getExpString().substring(0, 1);
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
            //同上
            if (context.getExpString().length()==0)
                return context.getItemVale();
            c = context.getExpString().substring(0, 1);
        }

        return context.getItemVale();
    }
}
