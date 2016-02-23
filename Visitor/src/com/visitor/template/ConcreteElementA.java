package com.visitor.template;

/**
 * 具体元素A，实现accept操作
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteElementA extends Element {

	// 利用双分派技术，实现处理与数据结构的分离
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	// 其他方法
	public void operatorA() {

	}

	@Override
	public String toString() {
		return "ConcreteElementA";
	}

}
