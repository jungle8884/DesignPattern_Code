package com.VisitorPattern.sample;

//为该对象结构中ConcreteElement的每一个类声明一个Visit操作
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
