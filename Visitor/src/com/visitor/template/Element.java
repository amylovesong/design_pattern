package com.visitor.template;

/**
 * ����һ��accept����������һ��������Ϊ����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
