package com.MediatorPattern.example;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //发送信息时通常是中介者发送出去的
    public void Send(String message){
        //当前对象(colleague1)通过中介发送消息
        mediator.Send(message, this);
    }

    public void Notify(String message){
        System.out.println("同事1得到信息:" + message);
    }
}
