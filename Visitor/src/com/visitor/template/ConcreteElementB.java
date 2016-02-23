package com.visitor.template;

/**
 * 具体元素B，实现accept操作
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void operatorB() {

	}

	@Override
	public String toString() {
		return "ConcreteElementB";
	}

}
