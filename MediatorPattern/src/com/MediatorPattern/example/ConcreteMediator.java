package com.MediatorPattern.example;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1){
        this.colleague1 = colleague1;
    }
    public void setColleague2(ConcreteColleague2 colleague2){
        this.colleague2 = colleague2;
    }

    /*重写发送信息的方法, 根据对象做出选择判断, 通知对象*/
    @Override
    public void Send(String message, Colleague colleague) {
        if(colleague == colleague1){
            //colleague1 通过中介发送消息给 colleague2, colleague2 接受消息并调用 Notify().
            colleague2.Notify(message);
        }else {
            colleague1.Notify(message);
        }
    }
}
