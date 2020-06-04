package com.MementoPattern.sample;

//发起人类
public class Originator {
    //记录
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    //创建备忘录, 将当前需要保存的信息导入并实例化出一个Memento对象
    public Memento CreateMemento(){
        return new Memento(state);
    }

    //恢复备忘录, 将Memento导入并将相关数据恢复
    public void SetMemento(Memento memento){
        state = memento.getState();
    }

    //显示数据
    public void Show(){
        System.out.println("State=" + state);
    }
}
