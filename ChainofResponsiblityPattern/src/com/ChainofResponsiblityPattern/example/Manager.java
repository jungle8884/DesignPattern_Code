package com.ChainofResponsiblityPattern.example;

public abstract class Manager {
    protected String name;

    // 管理者的上一级
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    // 设置管理者的上一级
    public void SetSuperior(Manager superior){
        this.superior = superior;
    }

    abstract public void RequestApplications(Request request);
}
