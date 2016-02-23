package com.visitor.template;

/**
 * Visitor�࣬Ϊ�ö���ṹ��ConcreteElement��ÿһ��������һ��visit����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA elementA);

	public abstract void visitConcreteElementB(ConcreteElementB elementB);
}
