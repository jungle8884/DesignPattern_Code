package com.CommandPattern;

//import com.CommandPattern.Notion.Command;
//import com.CommandPattern.Notion.ConcreteCommand;
//import com.CommandPattern.Notion.Invoker;
//import com.CommandPattern.Notion.Receiver;


public class Main {

    public static void main(String[] args) {
	// write your code here
        // 客户端实现
        {
            // 开店前的准备
            Barbecuer boy = new Barbecuer();
            Command bakeMuttoncommand_1 = new BakeMuttonCommand(boy);
            Command bakeMuttoncommand_2 = new BakeMuttonCommand(boy);
            Command bakeChichenWingCommand_1 = new BakeChickenWingCommand(boy);
            Waiter girl = new Waiter();

            // 开门营业 顾客点菜
            girl.SetOrder(bakeMuttoncommand_1);
            girl.SetOrder(bakeMuttoncommand_2);
            girl.SetOrder(bakeChichenWingCommand_1);

            // 点菜完毕, 通知厨房
            girl.Notify();
        }
        {
//            Receiver r = new Receiver();
//            Command c = new ConcreteCommand(r);
//            Invoker i = new Invoker();
//            i.SetCommand(c);
//            i.ExecuteCommand();
        }
    }
}
