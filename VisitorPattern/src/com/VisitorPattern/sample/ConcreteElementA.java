package com.VisitorPattern.sample;

//具体元素, 实现Accept操作
public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        //充分利用双分派技术, 实现处理与数据结构的分离.
        visitor.VisitConcreteElementA(this);
    }

    //其他的相关方法
    public void Operation(){}
}
