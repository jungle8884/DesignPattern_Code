package com.StatePattern.example;

//工作
public class Work {
    private State current;
    public Work(){
        //工作初始化为上午工作状态, 即上午9点开始上班
        current = new ForenoonState();
    }

    //"钟点"属性, 状态转换的依据.
    private double hour;
    public double getHour() {
        return hour;
    }
    public void setHour(double hour) {
        this.hour = hour;
    }

    //"任务完成"属性, 是否能下班的依据.
    private boolean finish = false;
    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    public boolean isFinish() {
        return finish;
    }

    //设置状态
    public void SetState(State s){
        current = s;
    }

    //写程序
    public void WriteProgram(){
        current.WriteProgram(this);
    }
}
