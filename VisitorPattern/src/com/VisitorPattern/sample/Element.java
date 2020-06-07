package com.VisitorPattern.sample;

//定义一个Accept操作, 它以一个访问者为参数.
public abstract class Element {
    public abstract void Accept(Visitor visitor);
}
