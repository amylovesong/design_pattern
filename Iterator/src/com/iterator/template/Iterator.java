package com.iterator.template;

/**
 * ������������
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Iterator {
	// ����õ���ʼ���󡢵õ���һ�������ж��Ƿ񵽽�β����ǰ����ȷ���
	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
