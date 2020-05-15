package com.ChainofResponsiblityPattern;

import com.ChainofResponsiblityPattern.example.CommonManager;
import com.ChainofResponsiblityPattern.example.GeneralManager;
import com.ChainofResponsiblityPattern.example.Majordomo;
import com.ChainofResponsiblityPattern.example.Request;

public class Main {

    public static void main(String[] args) {
	// write your code here
        {
//            Handler h1 = new ConcreteHandler_1();
//            Handler h2 = new ConcreteHandler_2();
//            Handler h3 = new ConcreteHandler_3();
//
//            h1.SetSuccessor(h2);
//            h2.SetSuccessor(h3);
//
//            int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
//
//            for (int request:requests) {
//                h1.HandleRequest(request);
//            }
        }
        // 加薪案例:
        {
            CommonManager jinli = new CommonManager("金利");
            Majordomo zongjian = new Majordomo("宗剑");
            GeneralManager zhongjingli = new GeneralManager("钟精励");

            jinli.SetSuperior(zongjian);
            zongjian.SetSuperior(zhongjingli);

            Request request1 = new Request();
            request1.RequestType = "请假";
            request1.RequestContent = "小菜请假";
            request1.Number = 1;
            jinli.RequestApplications(request1);

            Request request2 = new Request();
            request2.RequestType = "请假";
            request2.RequestContent = "小菜请假";
            request2.Number = 4;
            jinli.RequestApplications(request2);

            Request request3 = new Request();
            request3.RequestType = "加薪";
            request3.RequestContent = "小菜请求加薪";
            request3.Number = 500;
            jinli.RequestApplications(request3);

            Request request4 = new Request();
            request4.RequestType = "加薪";
            request4.RequestContent = "小菜请求加薪";
            request4.Number = 1000;
            jinli.RequestApplications(request4);

        }

    }
}
