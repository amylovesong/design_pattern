package com.adapter.template;

/**
 * ͨ�����ڲ���װһ��Adaptee���󣬰�Դ�ӿ�ת����Ŀ��ӿ�
 * 
 * @author sunxiaoling
 * 
 */
public class Adapter extends Target {
	// ����һ��˽�е�Adaptee����
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// �����Ϳ��԰ѱ����ϵ���Request()�������ʵ�ʵ���SpecificRequest()
		adaptee.specificRequest();
	}
}
