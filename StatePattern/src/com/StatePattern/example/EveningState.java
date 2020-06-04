package com.StatePattern.example;

//晚间工作状态
public class EveningState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.isFinish()){
            //如果完成任务, 则转入下班状态
            w.SetState(new RestState());
            w.WriteProgram();
        }else{
            if(w.getHour() < 21){
                System.out.println("当前时间: " + w.getHour() + "点 加班哦, 疲惫之极.");
            }else {
                //超过21点, 则转入睡眠工作状态
                w.SetState(new SleepingState());
                w.WriteProgram();
            }
        }
    }
}
