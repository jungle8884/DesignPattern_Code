package com.CommandPattern.Notion;

// 知道如何实施与执行一个请求相关的操作, 任何类都可能作为一个接收者.
public class Receiver {
    public void Action(){
        System.out.println("执行请求! ");
    }
}
