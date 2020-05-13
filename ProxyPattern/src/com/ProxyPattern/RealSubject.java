package com.ProxyPattern;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
