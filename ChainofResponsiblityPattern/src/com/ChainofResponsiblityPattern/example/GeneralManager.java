package com.ChainofResponsiblityPattern.example;

// 总经理
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {
        if(request.RequestType == "请假"){
            System.out.println(name + ":" + request.RequestContent + " 数量 " + request.Number + " 被批准");
        }else if(request.RequestType == "加薪" && request.Number <= 500){
            System.out.println(name + ":" + request.RequestContent + " 数量 " + request.Number + " 被批准");
        }
        else if(request.RequestType == "加薪" && request.Number > 500){
            System.out.println(name + ":" + request.RequestContent + " 数量 " + request.Number + " 再说吧");
        }
    }
}
