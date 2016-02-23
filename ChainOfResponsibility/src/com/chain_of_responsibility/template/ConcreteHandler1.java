package com.chain_of_responsibility.template;

//ConcreteHandler�࣬���崦�����࣬����������������󣬿ɷ������ĺ���ߣ�������Դ�������󣬾ʹ���֮������ͽ�������ת�������ĺ����
//ConcreteHandler1������������0��10֮������Ȩ��������ת����һλ
public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		// 0��10�����������
		if (request >= 0 && request < 10) {
			System.out.println("ConcreteHanlder1 ��������" + request);
		} else if (successor != null) {// ת�Ƶ���һλ
			successor.handleRequest(request);
		}
	}
}
