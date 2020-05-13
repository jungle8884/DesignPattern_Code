package com.FlyweightPattern;

import com.FlyweightPattern.example.User;
import com.FlyweightPattern.example.WebSite;
import com.FlyweightPattern.example.WebSiteFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        {
//            int extrinsicstate = 22;
//
//            FlyweightFactory f = new FlyweightFactory();
//
//            Flyweight fx = f.GetFlyweight("X");
//            fx.Operation(--extrinsicstate);
//
//            Flyweight fy = f.GetFlyweight("Y");
//            fx.Operation(--extrinsicstate);
//
//            Flyweight fz = f.GetFlyweight("Z");
//            fx.Operation(--extrinsicstate);
//
//            UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
//            uf.Operation(--extrinsicstate);
//        }
        // 实际例子
        {
            WebSiteFactory f = new WebSiteFactory();

            WebSite fx = f.GetWebSiteCategory("产品展示");
            fx.Use(new User("小蔡"));

            WebSite fy = f.GetWebSiteCategory("产品展示");
            fx.Use(new User("大鸟"));

            WebSite fz = f.GetWebSiteCategory("产品展示");
            fx.Use(new User("娇娇"));

            WebSite fl = f.GetWebSiteCategory("博客");
            fx.Use(new User("老顽童"));

            WebSite fm = f.GetWebSiteCategory("博客");
            fx.Use(new User("桃谷六仙"));

            WebSite fn = f.GetWebSiteCategory("博客");
            fx.Use(new User("南海鄂神"));

            System.out.println("得到网站分类总数为" + f.GetWebSiteCount());
        }
    }
}
