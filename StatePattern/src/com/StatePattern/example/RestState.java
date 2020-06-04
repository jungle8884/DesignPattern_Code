package com.StatePattern.example;

//下班休息状态
public class RestState extends State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间: " + w.getHour() + "点下班回家了.");
    }
}
