package com.visitor.template;

/**
 * Visitor类，为该对象结构中ConcreteElement的每一个类声明一个visit操作
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA elementA);

	public abstract void visitConcreteElementB(ConcreteElementB elementB);
}
