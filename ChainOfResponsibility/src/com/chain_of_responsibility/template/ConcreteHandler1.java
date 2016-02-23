package com.chain_of_responsibility.template;

//ConcreteHandler类，具体处理者类，处理他所负责的请求，可访问他的后继者，如果可以处理该请求，就处理之，否则就将该请求转发给他的后继者
//ConcreteHandler1，当请求数在0到10之间则有权处理，否则转到下一位
public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 0到10，处理此请求
		if (request >= 0 && request < 10) {
			System.out.println("ConcreteHanlder1 处理请求" + request);
		} else if (successor != null) {// 转移到下一位
			successor.handleRequest(request);
		}
	}
}
