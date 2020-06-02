package com.ObserverPattern.sample;

//具体观察者
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void Update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "的新状态是" + observerState);
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
    public ConcreteSubject getSubject() {
        return subject;
    }
}
