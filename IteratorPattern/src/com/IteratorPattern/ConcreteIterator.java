package com.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

//具体迭代器类
public class ConcreteIterator implements Iterator {
    //定义了一个具体聚集对象
    private List list = new ArrayList();
    private int current = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public Object First() {
        return list.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if(current < list.size()){
            ret = list.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        if(current == list.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object CurrentItem() {
        return list.get(current);
    }
}
