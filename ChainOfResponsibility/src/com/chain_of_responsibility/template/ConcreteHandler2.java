package com.chain_of_responsibility.template;

//ConcreteHandler2����������10��20֮������Ȩ��������ת����һλ
public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 10��20�����������
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2 ��������" + request);
		} else if (successor != null) {// ת�Ƶ���һλ
			successor.handleRequest(request);
		}
	}

}
