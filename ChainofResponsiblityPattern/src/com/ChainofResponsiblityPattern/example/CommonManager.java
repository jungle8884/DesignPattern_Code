package com.ChainofResponsiblityPattern.example;

// 经理
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {
        if(request.RequestType == "请假" && request.Number <= 2){
            System.out.println(name + ":" + request.RequestContent + " 数量" + request.Number + " 被批准");
        }else {
            // 其余的申请转到上一级
            if(superior != null)
                superior.RequestApplications(request);
        }
    }
}
