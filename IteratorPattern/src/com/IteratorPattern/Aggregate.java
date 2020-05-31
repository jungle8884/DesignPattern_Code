package com.IteratorPattern;

//聚集抽象类
interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    //创建迭代器
    public abstract Iterator CreateIterator();
}
