package com.chain_of_responsibility.main;

import com.chain_of_responsibility.example.Request;
import com.chain_of_responsibility.example.refactor.CommonManager;
import com.chain_of_responsibility.example.refactor.GeneralManager;
import com.chain_of_responsibility.example.refactor.Majordomo;
import com.chain_of_responsibility.template.ConcreteHandler1;
import com.chain_of_responsibility.template.ConcreteHandler2;
import com.chain_of_responsibility.template.ConcreteHandler3;
import com.chain_of_responsibility.template.Handler;

public class Main {
	public static void main(String[] args) {
		/********** 职责链模式第一版 **********/
		// // 三个管理者
		// Manager jinli = new Manager("金立");
		// Manager zongjian = new Manager("宗剑");
		// Manager zhongjingli = new Manager("钟精励");
		//
		// // 小菜请求加薪1000
		// Request request = new Request();
		// request.setRequestType("加薪");
		// request.setRequestContent("小菜请求加薪");
		// request.setNumber(1000);
		//
		// // 不同的级别对此请求做判断和处理
		// jinli.getResult("经理", request);
		// zongjian.getResult("总监", request);
		// zhongjingli.getResult("总经理", request);
		//
		// // 小菜请假3天
		// Request request2 = new Request();
		// request2.setRequestType("请假");
		// request2.setRequestContent("小菜请假");
		// request2.setNumber(3);
		//
		// jinli.getResult("经理", request2);
		// zongjian.getResult("总监", request2);
		// zhongjingli.getResult("总经理", request2);

		/********** 职责链模式模板 **********/
		// Handler h1 = new ConcreteHandler1();
		// Handler h2 = new ConcreteHandler2();
		// Handler h3 = new ConcreteHandler3();
		// // 设置职责链上家与下家
		// h1.setSuccessor(h2);
		// h2.setSuccessor(h3);
		//
		// int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };
		//
		// // 循环给最小处理者提交请求，不同的数额，由不同权限处理者处理
		// for (int request : requests) {
		// h1.handleRequest(request);
		// }

		/********** 职责链模式重构版 **********/
		CommonManager jinli = new CommonManager("金利");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager zhongjingli = new GeneralManager("钟精励");
		// 设置上级，完全可以根据实际需求来更改设置
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);

		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		// 客户端的申请都是由“经理”发起，但实际谁来决策由具体管理类来处理，客户端不知道
		jinli.requestApplications(request);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jinli.requestApplications(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		jinli.requestApplications(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		jinli.requestApplications(request4);
	}
}
