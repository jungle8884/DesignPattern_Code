package com.ObserverPattern.sample;

//具体主题
public class ConcreteSubject extends Subject {
    private String subjectState;

    //具体观察者状态
    public String getSubjectState(){
        return subjectState;
    }
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
