package com.visitor.template;

/**
 * 具体访问者1，实现每个由Visitor声明的操作。每个操作实现算法的一部分，而该算法片断乃是对应于结构中对象的类
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		System.out.println(elementA.toString() + "被" + this.toString() + "访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		System.out.println(elementB.toString() + "被" + this.toString() + "访问");
	}

	@Override
	public String toString() {
		return "ConcreteVisitor1";
	}

}
