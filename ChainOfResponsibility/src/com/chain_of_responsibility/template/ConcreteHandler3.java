package com.chain_of_responsibility.template;

//ConcreteHandler3，当请求数在20到30之间则有权处理，否则转到下一位
public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 20到30，处理此请求
		if (request >= 20 && request < 30) {
			System.out.println("ConcreteHandler3 处理请求" + request);
		} else if (successor != null) {// 转移到下一位
			successor.handleRequest(request);
		}
	}

}
