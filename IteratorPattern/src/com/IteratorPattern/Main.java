package com.IteratorPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Aggregate aggregate = new ConcreteAggregate();//公交车

        /*新来的乘客*/
        aggregate.add("大鸟");
        aggregate.add("小蔡");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公交内部员工");
        aggregate.add("小偷");

        //售票员
        Iterator i = aggregate.CreateIterator();

        Object item = i.First();
        while(!i.IsDone()){
            System.out.println(i.CurrentItem() + "请买车票!");
            i.Next();
        }
    }
}
