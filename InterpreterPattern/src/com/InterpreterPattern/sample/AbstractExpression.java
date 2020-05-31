package com.InterpreterPattern.sample;

//抽象表达式声明一个抽象的解释操作,这个接口为抽象语法树中所有的节点所共享.
public abstract class AbstractExpression {
    public abstract void Interpret(Context context);
}
