package com.visitor.template;

/**
 * ����Ԫ��A��ʵ��accept����
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteElementA extends Element {

	// ����˫���ɼ�����ʵ�ִ��������ݽṹ�ķ���
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	// ��������
	public void operatorA() {

	}

	@Override
	public String toString() {
		return "ConcreteElementA";
	}

}
