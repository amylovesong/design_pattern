package com.visitor.template;

/**
 * ���������2��ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ�����Ƕ�Ӧ�ڽṹ�ж������
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		System.out.println(elementA.toString() + "��" + this.toString() + "����");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		System.out.println(elementB.toString() + "��" + this.toString() + "����");
	}

	@Override
	public String toString() {
		return "ConcreteVisitor2";
	}

}
