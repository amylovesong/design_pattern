package com.visitor.template;

/**
 * 定义一个accept操作，它以一个访问者为参数
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
