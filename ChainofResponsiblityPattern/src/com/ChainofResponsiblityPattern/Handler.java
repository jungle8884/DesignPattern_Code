package com.ChainofResponsiblityPattern;

public abstract class Handler {
    protected Handler successor;

    //设置继任者
    public void SetSuccessor(Handler successor){
        this.successor = successor;
    }

    //处理请求的抽象方法
    public abstract void HandleRequest(int request);
}
