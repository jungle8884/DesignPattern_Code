package com.MediatorPattern.example;

//抽象中介者
public abstract class Mediator {
    //定义一个抽象的发送消息方法, 得到同事对象和发送消息
    public abstract void Send(String message, Colleague colleague);
}
