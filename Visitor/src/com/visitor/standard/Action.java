package com.visitor.standard;

/**
 * ״̬�ĳ�����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Action {
	public abstract String getActionName();

	// �õ����˽��ۻ�Ӧ
	public abstract void getManConclusion(Man concreteElementA);

	// �õ�Ů�˽��ۻ�Ӧ
	public abstract void getWomanConclusion(Woman concreteElementB);
}
