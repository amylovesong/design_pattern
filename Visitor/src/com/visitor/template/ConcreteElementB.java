package com.visitor.template;

/**
 * ����Ԫ��B��ʵ��accept����
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
