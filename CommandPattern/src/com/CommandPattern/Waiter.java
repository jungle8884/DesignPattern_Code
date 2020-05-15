package com.CommandPattern;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

// 服务员
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    // 设置订单
    public void SetOrder(Command command){
        // 在客户提出请求时, 对没货的烧烤进行回绝.
        if(command.toString().contains("BakeChickenWingCommand")){
            System.out.println("服务员: 鸡翅没有了, 请点别的烧烤. ");
        }
        else {
            // 记录客户所在的烧烤的日志, 以备算账收钱.
            orders.add(command);

            // 设置当前时间
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String DataTime = dateFormat.format(now);

            System.out.println("增加订单: " + command.toString() + " 时间: " + DataTime);
        }
    }

    // 取消订单
    public void CancelOrder(Command command){
        orders.remove(command);

        // 设置当前时间
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        String DataTime = dateFormat.format(now);

        System.out.println("取消订单: " + command.toString() + " 时间: " + DataTime);
    }

    // 通知执行
    public void Notify(){
        // 根据用户点好的烧烤订单通知厨房制作
        for (Command cmd:orders) {
            cmd.ExcuteCommand();
        }
    }
}
