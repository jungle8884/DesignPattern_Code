package com.MementoPattern.sample;

//备忘录类
public class Memento {
    //记录
    private String state;

    //构造方法, 将相关数据导入.
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
