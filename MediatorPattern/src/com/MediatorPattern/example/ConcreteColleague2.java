package com.MediatorPattern.example;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message){
        mediator.Send(message, this);
    }

    public void Notify(String message){
        System.out.println("同事2得到信息:" + message);
    }
}
