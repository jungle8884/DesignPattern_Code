package com.IteratorPattern;

interface Iterator {
    //得到开始对象
    public abstract Object First();
    //得到下一对象
    public abstract Object Next();
    //判断是否到结尾
    public abstract boolean IsDone();
    //当前对象
    public abstract Object CurrentItem();
}
