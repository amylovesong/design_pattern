package com.visitor.standard;

/**
 * ���ˡ��ĳ�����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Person {
	// ���ܡ�����Ϊ��״̬������
	public abstract void accept(Action visitor);

	public abstract String getName();
}
