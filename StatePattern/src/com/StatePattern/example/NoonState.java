package com.StatePattern.example;

//中午工作状态
public class NoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour() < 13){
            System.out.println("当前时间: " + w.getHour() + "点" + " 饿了, 午饭: 犯困, 午休.");
        }else {
            //超过13点, 则转入下午工作状态
            w.SetState(new AfternoonState());
            w.WriteProgram();
        }
    }
}
