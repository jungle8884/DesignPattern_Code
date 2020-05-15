package com.CommandPattern.Notion;

// 将一个接收者对象绑定于一个动作, 调用接受者相应的操作, 以实现Execute.
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        receiver.Action();
    }
}
