package com.StatePattern.example;

//下午和傍晚工作状态
public class AfternoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour() < 17){
            System.out.println("当前时间: " + w.getHour() + "点" + "下午状态还不错, 继续努力");
        }else{
            //超过17点, 则转入傍晚工作状态.
            w.SetState(new EveningState());
            w.WriteProgram();
        }
    }
}
