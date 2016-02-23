package com.chain_of_responsibility.template;

//ConcreteHandler2，当请求在10到20之间则有权处理，否则转到下一位
public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 10到20，处理此请求
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2 处理请求" + request);
		} else if (successor != null) {// 转移到下一位
			successor.handleRequest(request);
		}
	}

}
