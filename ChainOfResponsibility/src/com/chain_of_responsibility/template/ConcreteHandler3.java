package com.chain_of_responsibility.template;

//ConcreteHandler3������������20��30֮������Ȩ��������ת����һλ
public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 20��30�����������
		if (request >= 20 && request < 30) {
			System.out.println("ConcreteHandler3 ��������" + request);
		} else if (successor != null) {// ת�Ƶ���һλ
			successor.handleRequest(request);
		}
	}

}
